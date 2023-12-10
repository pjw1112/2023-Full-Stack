let id_form = document.querySelector("#id");
let pass_form = document.querySelector("#pass");
let pass2_form = document.querySelector("#pass2");
let email_form = document.querySelector("#email");
let birth_form = document.querySelector("#birth");

let id_form_label_Check = document.querySelector(".id_check .check_message");
let pass_form_label_Check = document.querySelector(".pass_check .check_message");
let pass2_form_label_Check = document.querySelector(".pass2_check .check_message");
let email_form_label_Check = document.querySelector(".email_check .check_message");
let birth_form_label_Check = document.querySelector(".birth_check .check_message");

let login_click = document.querySelector(".login_click");
let login_box = document.querySelector(".login_box");

let join_click = document.querySelector(".join_click");
let join_box = document.querySelector(".join_box");

let background_black = document.querySelector(".black");

let id_ok = false;
let pass_ok = false;
let pass2_ok = false;
let email_ok = false;


login_click.addEventListener("click" , () => {
  login_box.style.display="initial"
  background_black.style.display="initial"
  
});

join_click.addEventListener("click" , () => {
  join_box.style.display="initial"
  background_black.style.display="initial"
  
});

background_black.addEventListener("click" , () => {
  login_box.style.display="none"
  join_box.style.display="none"
  background_black.style.display="none"
});



//ID 조건 확인
id_form.addEventListener("input", () => {
  if (id_form.value.length != 0) {
    if (4 <= id_form.value.length && id_form.value.length <= 20) {
      id_form_label_Check.innerHTML = "";
      let p = document.createElement("p");
      p.innerHTML = "아이디 조건 충족";
      p.classList.add("success");
      id_form_label_Check.appendChild(p);

      let success = document.createElement("div");
      success.innerHTML = "<i class='fa-regular fa-circle-check'></i>";
      success.classList.add("check_success");
      id_form_label_Check.appendChild(success);

      id_ok = true;
    } else {
      id_form_label_Check.innerHTML = "";
      let p = document.createElement("p");
      p.innerHTML = "아이디는 4자이상 20자이하";
      p.classList.add("fail");
      id_form_label_Check.appendChild(p);

      let fail = document.createElement("div");
      fail.innerHTML = "<i class='fa-regular fa-circle-xmark'></i>";
      fail.classList.add("check_fail");
      id_form_label_Check.appendChild(fail);

      id_ok = false;
    }
  } else {
    id_form_label_Check.innerHTML = "";
    id_ok = false;
  }
});


//PASS 조건 확인
pass_form.addEventListener("input", () => {
    if (pass_form.value.length != 0) {
      if (4 <= pass_form.value.length && pass_form.value.length <= 20) {
        pass_form_label_Check.innerHTML = "";
        let p = document.createElement("p");
        p.innerHTML = "비밀번호 조건 충족";
        p.classList.add("success");
        pass_form_label_Check.appendChild(p);
  
        let success = document.createElement("div");
        success.innerHTML = "<i class='fa-regular fa-circle-check'></i>";
        success.classList.add("check_success");
        pass_form_label_Check.appendChild(success);

        pass_ok = true;
      } else {
        pass_form_label_Check.innerHTML = "";
        let p = document.createElement("p");
        p.innerHTML = "비밀번호는 4자이상 20자이하";
        p.classList.add("fail");
        pass_form_label_Check.appendChild(p);
  
        let fail = document.createElement("div");
        fail.innerHTML = "<i class='fa-regular fa-circle-xmark'></i>";
        fail.classList.add("check_fail");
        pass_form_label_Check.appendChild(fail);

        pass_ok = false;
      }
    } else {
      pass_form_label_Check.innerHTML = "";
      pass_ok = false;
    }
    pass_match()
  });




  //PASS2 조건 확인
pass2_form.addEventListener("input", () => {
    pass_match();
  });

function pass_match(){
    if (pass2_form.value.length != 0) {
        if (pass_form.value == pass2_form.value) {
          pass2_form_label_Check.innerHTML = "";
          let p = document.createElement("p");
          p.innerHTML = "비밀번호 일치";
          p.classList.add("success");
          pass2_form_label_Check.appendChild(p);
    
          let success = document.createElement("div");
          success.innerHTML = "<i class='fa-regular fa-circle-check'></i>";
          success.classList.add("check_success");
          pass2_form_label_Check.appendChild(success);

          pass2_ok = true;
        } else {
          pass2_form_label_Check.innerHTML = "";
          let p = document.createElement("p");
          p.innerHTML = "비밀번호 불일치";
          p.classList.add("fail");
          pass2_form_label_Check.appendChild(p);
    
          let fail = document.createElement("div");
          fail.innerHTML = "<i class='fa-regular fa-circle-xmark'></i>";
          fail.classList.add("check_fail");
          pass2_form_label_Check.appendChild(fail);

          pass2_ok = false;
        }
      } else {
        pass2_form_label_Check.innerHTML = "";
        pass2_ok = false;
      }
}

//email 조건 확인
email_form.addEventListener("input", () =>{

    let email = email_form.value;
    let emailRegex = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
    
    if (email_form.value.length != 0) {
        if (emailRegex.test(email)) {
          email_form_label_Check.innerHTML = "";
          let p = document.createElement("p");
          p.innerHTML = "이메일 형식 충족";
          p.classList.add("success");
          email_form_label_Check.appendChild(p);
    
          let success = document.createElement("div");
          success.innerHTML = "<i class='fa-regular fa-circle-check'></i>";
          success.classList.add("check_success");
          email_form_label_Check.appendChild(success);

          email_ok = true;

        } else {
          email_form_label_Check.innerHTML = "";
          let p = document.createElement("p");
          p.innerHTML = "이메일 형식으로 입력";
          p.classList.add("fail");
          email_form_label_Check.appendChild(p);
    
          let fail = document.createElement("div");
          fail.innerHTML = "<i class='fa-regular fa-circle-xmark'></i>";
          fail.classList.add("check_fail");
          email_form_label_Check.appendChild(fail);

          email_ok = false;
        }
      } else {
        email_form_label_Check.innerHTML = "";
        email_ok = false;
      }

});

birth_form.addEventListener("input",() =>{

});