let month_display = document.querySelector(".month_display");
let list_column = document.querySelector(".list_column");
let calendar_body = document.querySelector(".calendar_body");
let left_arrow = document.querySelector(".left_arrow");
let right_arrow = document.querySelector(".right_arrow");
let view_type_dom = document.querySelectorAll(".view_type");
let dropdown_toggle = document.querySelector(".dropdown-toggle");

let dt = new Date();
dt = new Date(dt.getFullYear(), dt.getMonth(), dt.getDate());

let nav = 0; //월 이동 할때마다 +1 or -1 해주고 0으로 다시 초기화 되는 변수
let nav2 = 0; //년 이동 할때마다 +1 or -1 해주고 0으로 다시 초기화 되는 변수
let nav3 = 0; //주 이동 할때마다 +1 or -1 해주고 0으로 다시 초기화 되는 변수
let view_type_list = ["일별", "주별", "월별", "년별"];
let view_type = "주별";
let week_str = ["일", "월", "화", "수", "목", "금", "토"];

load();

// 이벤트 리스너 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

view_type_dom.forEach((e, i) => {
  e.addEventListener("click", () => {
    view_type = view_type_list[i];
    dropdown_toggle.innerText = view_type_list[i] + " 보기";
    load();
  });
});

left_arrow.addEventListener("click", () => {
  switch (view_type) {
    case "년별":
      nav2--;
      load();
      break;

    case "월별":
      nav--;
      load();
      break;

    case "주별":
      break;

    case "일별":
      break;
  }
});

right_arrow.addEventListener("click", () => {
  switch (view_type) {
    case "년별":
      nav2++;
      load();
      break;

    case "월별":
      nav--;
      load();
      break;

    case "주별":
      break;

    case "일별":
      break;
  }
});

document.addEventListener("keydown", (e) => {
  if (e.key == "ArrowRight") {
    switch (view_type) {
      case "년별":
        nav2++;
        load();
        break;

      case "월별":
        nav++;
        load();
        break;

      case "주별":
        break;

      case "일별":
        break;
    }
  } else if (e.key == "ArrowLeft") {
    switch (view_type) {
      case "년별":
        nav2--;
        load();
        break;

      case "월별":
        nav--;
        load();
        break;

      case "주별":
        break;

      case "일별":
        break;
    }
  } else if (e.key == "ArrowUp") {
    switch (view_type) {
      case "년별":
        break;

      case "월별":
        nav2++;
        load();
        break;

      case "주별":
        break;

      case "일별":
        break;
    }
  } else if (e.key == "ArrowDown") {
    switch (view_type) {
      case "년별":
        break;

      case "월별":
        nav2--;
        load();
        break;

      case "주별":
        break;

      case "일별":
        break;
    }
  } else if (e.key == "Escape") {
    let i = new Date();
    dt = new Date(i.getFullYear(), i.getMonth(), i.getDate());
    load();
  }

  if (1 <= parseInt(e.key) && parseInt(e.key) <= 4) {
    if (view_type != view_type_list[parseInt(e.key) - 1]) {
      view_type = view_type_list[parseInt(e.key) - 1];
      dropdown_toggle.innerText = view_type_list[parseInt(e.key) - 1] + " 보기";
      load();
    }
  }
});
// 이벤트 리스너 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

//메인 view 구현
function load() {
  //1. 기존에 작성된 view 비우기
  calendar_body.innerHTML = "";
  list_column.innerHTML = "";

  //2. 년,월 이동 변수 더해주기
  if (nav !== 0) {
    dt.setMonth(dt.getMonth() + nav);
  }
  if (nav2 !== 0) {
    dt.setFullYear(dt.getFullYear() + nav2);
  }

  //3. 확정된 년, 월 기준으로 필요한 변수 계산
  let month = dt.getMonth(); //월 (int)
  let month_str = dt.toLocaleString("default", { month: "long" }); //월 (String)
  let year = dt.getFullYear(); //년
  let week = new Date(year, month, 1).getDay(); //요일 (int)
  let day = dt.getDate();

  //4. 상단 년 / 월 표시

  //5. 현재 뷰타입에 따라 캘린더 구현
  switch (view_type) {
    case "년별":
      month_display.innerText = year + "년 ";
      view_like_year(year);
      break;

    case "월별":
      month_display.innerText = year + "년 " + month_str;
      view_like_month(week, month, year);
      break;

    case "주별":
      month_display.innerText = year + "년 " + month_str;
      view_like_week(day, week, month, year);
      break;

    case "일별":
      month_display.innerText = year + "년 " + month_str;
      view_like_day(day, week, month, year);
      break;
  }

  //END 년,월 이동 변수 초기화
  nav = 0;
  nav2 = 0;
}
//캘린더를 년 형태로 출력해주는 함수
function view_like_year(year) {
  calendar_body.style.gridTemplateColumns = "1fr 1fr 1fr 1fr";
  calendar_body.style.gridGap = "25px";
  calendar_body.style.padding = "30px";

  for (let i = 0; i < 12; i++) {
    let daysInMonth = new Date(year, i + 1, 0).getDate(); //n월의 총 일 수
    let firstDayInt = new Date(year, i, 1).getDay(); //n월이 시작하는 요일 int값

    let month_box = document.createElement("div");
    month_box.classList.add("month_box");

    // month_box 첫 줄 : 몇 월 표시
    let month_name = document.createElement("div");
    month_name.innerHTML = "&nbsp " + (i + 1) + "월";
    month_box.appendChild(month_name);

    // month_box 둘째 줄 : 요일 표시
    let week_box = document.createElement("div");
    for (let i = 0; i < 7; i++) {
      let item = document.createElement("div");
      item.innerText = week_str[i];
      week_box.appendChild(item);
      week_box.classList.add("week_box");
    }
    month_box.appendChild(week_box);

    // month_box 셋째 줄 : 일 표시
    let last_box = document.createElement("div");
    last_box.classList.add("last_box");
    for (let i = 0; i < firstDayInt; i++) {
      let bin_box = document.createElement("div");
      bin_box.classList.add("bin_box");
      bin_box.innerHTML = "&nbsp";
      last_box.appendChild(bin_box);
    }
    month_box.appendChild(last_box);

    for (let i = 0; i < daysInMonth; i++) {
      let item = document.createElement("div");
      item.style.fontSize = "14px";
      item.style.textAlign = "center";
      item.style.height = "30px";
      item.innerText = i + 1;
      last_box.appendChild(item);
    }

    calendar_body.appendChild(month_box);
  }
}

//캘린더를 월 형태로 출력해주는 함수
function view_like_month(week, month, year) {
  calendar_body.style.gridTemplateColumns = "1fr 1fr 1fr 1fr 1fr 1fr 1fr";
  calendar_body.style.gridGap = "1px";

  //상단 날짜 구분 기준 표현
  for (let i = 0; i < 7; i++) {
    let item = document.createElement("div");
    item.classList.add("week");
    item.innerText = week_str[i];
    list_column.appendChild(item);
  }

  //전 달(before month) 표현
  let daysInBeforeMonth = new Date(year, month, 0).getDate(); //전달의 총 일 수
  for (let i = 0; i < week; i++) {
    let dt_temp = new Date(year, month - 1, daysInBeforeMonth - (week - i - 1));
    let dateString = dt_temp.toLocaleDateString("default", {
      weekday: "long",
      year: "numeric",
      month: "numeric",
      day: "numeric",
    });

    let item = document.createElement("div");
    item.classList.add("beforeMonth_daybox");
    item.id = dateString;
    item.innerText = daysInBeforeMonth - (week - i - 1);
    calendar_body.appendChild(item);
  }

  //이번 달(this month) 표현
  let daysInMonth = new Date(year, month + 1, 0).getDate(); //이번 달의 총 일 수
  for (let i = 0; i < daysInMonth; i++) {
    let dt_temp = new Date(year, month, i + 1);
    let dateString = dt_temp.toLocaleDateString("default", {
      weekday: "long",
      year: "numeric",
      month: "numeric",
      day: "numeric",
    });

    let item = document.createElement("div");
    item.classList.add("thisMonth_daybox");
    item.id = dateString;
    item.innerText = i + 1;
    calendar_body.appendChild(item);
  }

  //다음 달(after month) 표현
  FirstDayInAfterMonth = new Date(year, month + 1, 1).getDay();
  let temp = [0, 6, 5, 4, 3, 2, 1];
  for (let i = 0; i < temp[FirstDayInAfterMonth]; i++) {
    let dt_temp = new Date(year, month + 1, i + 1);
    let dateString = dt_temp.toLocaleDateString("default", {
      weekday: "long",
      year: "numeric",
      month: "numeric",
      day: "numeric",
    });
    let item = document.createElement("div");
    item.classList.add("afterMonth_daybox");
    item.id = dateString;
    item.innerText = i + 1;
    calendar_body.appendChild(item);
  }
}

//캘린더를 주 형태로 출력해주는 함수
function view_like_week(day, week, month, year) {
  calendar_body.style.gridTemplateColumns = "1fr 1fr 1fr 1fr 1fr 1fr 1fr";
  calendar_body.style.gridGap = "1px";

  //상단 날짜 구분 기준 표현
  for (let i = 0; i < 7; i++) {
    let item = document.createElement("div");
    item.classList.add("week");
    item.innerText = week_str[i];
    list_column.appendChild(item);
  }

  //전 달(before month) 표현
  let daysInBeforeMonth = new Date(year, month, 0).getDate(); //전달의 총 일 수
  for (let i = 0; i < week; i++) {
    let dt_temp = new Date(year, month - 1, daysInBeforeMonth - (week - i - 1));
    let dateString = dt_temp.toLocaleDateString("default", {
      weekday: "long",
      year: "numeric",
      month: "numeric",
      day: "numeric",
    });

    let item = document.createElement("div");
    item.classList.add("beforeMonth_daybox");
    item.id = dateString;
    item.innerText = daysInBeforeMonth - (week - i - 1);
    calendar_body.appendChild(item);
  }

  //이번 달(this month) 표현
  let daysInMonth = new Date(year, month + 1, 0).getDate(); //이번 달의 총 일 수
  for (let i = 0; i < daysInMonth; i++) {
    let dt_temp = new Date(year, month, i + 1);
    let dateString = dt_temp.toLocaleDateString("default", {
      weekday: "long",
      year: "numeric",
      month: "numeric",
      day: "numeric",
    });

    let item = document.createElement("div");
    item.classList.add("thisMonth_daybox");
    item.id = dateString;
    item.innerText = i + 1;
    calendar_body.appendChild(item);
  }

  //다음 달(after month) 표현
  FirstDayInAfterMonth = new Date(year, month + 1, 1).getDay();
  let temp = [0, 6, 5, 4, 3, 2, 1];
  for (let i = 0; i < temp[FirstDayInAfterMonth]; i++) {
    let dt_temp = new Date(year, month + 1, i + 1);
    let dateString = dt_temp.toLocaleDateString("default", {
      weekday: "long",
      year: "numeric",
      month: "numeric",
      day: "numeric",
    });
    let item = document.createElement("div");
    item.classList.add("afterMonth_daybox");
    item.id = dateString;
    item.innerText = i + 1;
    calendar_body.appendChild(item);
  }

  let total_week = Math.floor((week + new Date(year, month + 1, 0).getDate()) / 7);
  let this_week = Math.floor( (week + new Date(year, month, day).getDate()) / 7);
  console.log("총 : " + total_week);
  console.log("오늘은 : " + this_week); 

  calendar_body.childNodes.forEach((e,i) => {
    console.log(this_week, Math.floor(((i+1)/7)));
    if(Math.floor(((i+1)/7))!=this_week){
      
      e.remove();
    }
  });
  

 












}












//캘린더를 일 형태로 출력해주는 함수
function view_like_day(day, week, month, year) {}
