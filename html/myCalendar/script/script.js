let month_display = document.querySelector(".month_display");
let calendar_body = document.querySelector(".calendar_body");
let left_arrow = document.querySelector(".left_arrow");
let right_arrow = document.querySelector(".right_arrow");

let dt = new Date();
let day = dt.getDate(); //일
let week = dt.getDay(); //요일 (int)
let week_str = dt.toLocaleString("default", { weekday: "long" }); //요일 (String)
let month = dt.getMonth()+1; //월 (int)
let month_str = dt.toLocaleString("default", { month: "long" }); //월 (String)
let year = dt.getFullYear(); //년
let firstDayofMonth = new Date(year, month, 1); //달의 1일
let daysInMonth = new Date(year, month + 1, 0).getDate(); //달의 총 일 수
let beforeDaysInMonth = new Date(year, month, 0).getDate(); //전달의 총 일 수
let sum = 0;
dt= new Date(year,month,1);

left_arrow.addEventListener("click", function () {
  dt.setMonth(--month);
  dt.setDate(1);
  date_refresh();
  
});
  console.log(year+"년 "+month+"월 "+ day+"일" );
right_arrow.addEventListener("click", function () {
  console.log(year+"년 "+month+"월 "+ day+"일" );
  dt.setMonth(++month);
  console.log(year+"년 "+month+"월 "+ day+"일" );
  dt.setDate(1);
  console.log(year+"년 "+month+"월 "+ day+"일" );
  date_refresh();
  console.log(year+"년 "+month+"월 "+ day+"일" );
    
});



//아래쪽은 펑션
function date_refresh() {
  day = dt.getDate(); //일
  week = dt.getDay();
  week_str = dt.toLocaleString("default", { weekday: "long" });
  month = dt.getMonth(); //월
  month_str = dt.toLocaleString("default", { month: "long" });
  year = dt.getFullYear(); //년
  firstDayofMonth = new Date(year, month, 1); //달의 1일
  daysInMonth = new Date(year, month + 1, 0).getDate(); //달의 총 일 수
  beforeDaysInMonth = new Date(year, month, 0).getDate(); //전달의 총 일 수
  sum = 0;

  //이전에 배치되었던 데이 박스들 모두 삭제
  calendar_body.innerHTML="";

  load(); //데이박스 새로 배치
}

function load() {
  month_display.innerText = year+"년 "+month_str;

  //전 달(before month) 표현
  for (let i = 0; i < week; i++) {
    sum++;
    let item = document.createElement("div");
    item.classList.add("beforeMonth_daybox");
    item.classList.add(`beforemonthbox${i}`);
    item.innerText = beforeDaysInMonth - (week - i - 1);
    calendar_body.appendChild(item);
  }

  //이번 달(this month) 표현
  for (let i = 0; i < daysInMonth; i++) {
    sum++;
    let item = document.createElement("div");
    item.classList.add("thisMonth_daybox");
    item.classList.add(`thismonthbox${i}`);
    item.innerText = i + 1;
    calendar_body.appendChild(item);
  }
  
  let nextMonthDay1 = dt;
  
  nextMonthDay1.setMonth(dt.getMonth()+1);
  nextMonthDay1.setDate(1);
  let num = nextMonthDay1.getDay();
  
  //총 35개
  for (let i = 0; i < 7-num; i++) {
    let item = document.createElement("div");
    item.classList.add("afterMonth_daybox");
    item.classList.add(`aftermonthbox${i}`);
    item.innerText = i + 1;
    calendar_body.appendChild(item);
  }
}




load();