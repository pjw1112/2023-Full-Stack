let nav = 0;
let clicked = null;
let events = localStorage.getItem("events")? JSON.parse(localStorage.getItem("events")): [];


const calendar = document.getElementById("calendar");
const backDrop = document.getElementById("modalBackDrop");
const newEventModal = document.getElementById("newEventModal");
const deleteEventModal = document.getElementById("deleteEventModal");
const eventTitleInput = document.getElementById("eventTitleInput");
const eventTitleUpdate = document.getElementById("eventTitleUpdate");
const weekdays = [ "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",];

document.getElementById("nextButton").addEventListener("click", () => {
  nav++;
  load();
});

document.getElementById("backButton").addEventListener("click", () => {
  nav--;
  load();
});

document.getElementById("saveButton").addEventListener("click", saveEvent);
document.getElementById("cancelButton").addEventListener("click", closeModal);
document.getElementById("updateButton").addEventListener("click", updateEvent);
document.getElementById("deleteButton").addEventListener("click", deleteEvent);
document.getElementById("closeButton").addEventListener("click", closeModal);



function openModal(date) {
  clicked = date;

  const eventForDate = events.find((e) => e.date === clicked);

  if (eventForDate) {
    eventTitleUpdate.value = eventForDate.title;
    deleteEventModal.style.display = "block";
  } else {
    newEventModal.style.display = "block";
  }

  backDrop.style.display = "block";
}

function closeModal() {
  eventTitleInput.classList.remove("error");
  newEventModal.style.display = "none";
  deleteEventModal.style.display = "none";
  backDrop.style.display = "none";
  eventTitleInput.value = "";
  clicked = null;
  load();
}

function saveEvent() {
  if (eventTitleInput.value) {
    eventTitleInput.classList.remove("error");

    events.push({
      date: clicked,
      title: eventTitleInput.value
    });

    localStorage.setItem("events", JSON.stringify(events));
    closeModal();
  } else {
    eventTitleInput.classList.add("error");
  }
}

function updateEvent() {
  if (eventTitleUpdate.value) {
    eventTitleUpdate.classList.remove("error");
    events.forEach((evt) => {
      if (evt.date === clicked) {
        evt.title = eventTitleUpdate.value;
      }
    });
    localStorage.setItem("events", JSON.stringify(events));
    closeModal();
  } else {
    eventTitleUpdate.classList.add("error");
  }
}

function deleteEvent() {
  events = events.filter((e) => e.date !== clicked);

  localStorage.setItem("events", JSON.stringify(events));
  closeModal();
}

function load() {
  const dt = new Date();

  if (nav !== 0) {
    dt.setMonth(new Date().getMonth() + nav);
  }

  const day = dt.getDate();
  const month = dt.getMonth();
  const year = dt.getFullYear();

  const firstDayofMonth = new Date(year, month, 1);
  const daysInMonth = new Date(year, month + 1, 0).getDate();

  document.getElementById("monthDisplay").innerText = `${year}년 ${dt.toLocaleDateString("default",{month: "long",})} `;

  const dateString = firstDayofMonth.toLocaleDateString("en-IN", {
    weekday: "long",
    year: "numeric",
    month: "numeric",
    day: "numeric",
  });

  const paddingDays = weekdays.indexOf(dateString.split(", ")[0]);

  calendar.innerHTML = "";

  for (let i = 1; i <= paddingDays + daysInMonth; i++) {
    const daySquare = document.createElement("div");
    daySquare.classList.add("day");

    const dayString = `${i - paddingDays}/${month + 1}/${year}`;

    if (i > paddingDays) {
      daySquare.innerText = i - paddingDays;

      if (i - paddingDays == day && nav == 0) {
        daySquare.id = "currentDay";
      }

      const eventForDay = events.find((e) => (e.date === dayString));

      if (eventForDay) {
        const eventDiv = document.createElement("div");
        eventDiv.classList.add("event");
        eventDiv.innerText = eventForDay.title;
        daySquare.appendChild(eventDiv);
      }

      daySquare.addEventListener("click", () => openModal(dayString));
    } else {
      daySquare.classList.add("padding");
    }

    calendar.appendChild(daySquare);
  }
}


load();

