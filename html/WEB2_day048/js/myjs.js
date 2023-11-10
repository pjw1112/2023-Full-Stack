$(function(){
   //1. gnb_sub  안보이게 숨기기
   $(".header  .gnb_sub").hide();

   //2. li에 마우스를 올리면 해당 gnb_sub slideDown
   //3. li에 마우스를 올리면 해당 gnb_sub slideUp
   $(".header .navbar-nav  li").mouseover(function(){
    $(this).children(".gnb_sub").stop().slideDown();
   }).mouseout(function(){
    $(this).children(".gnb_sub").stop().slideUp();
   });
});