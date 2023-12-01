<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <div class="container mysub">
  <h3>글쓰기 폼</h3>
   <form action="" method="post">
   <fieldset>
    <legend>CREATE-WRITE</legend>
    
      <div class="form-group">
     <label for="bname">조회수</label>
     <input type="text" id="bname" name="bname" class="form-control readonly"/>
    </div>
    
    <div class="form-group">
     <label for="bname">이름</label>
     <input type="text" id="bname" name="bname" class="form-control readonly""/>
    </div>
    
    <div class="form-group">
     <label for="bname">제목</label>
     <input type="text" id="btitle" name="bititle" class="form-control readonly""/>
    </div>
    
    <div class="form-group">
     <label for="bname">내용</label>
     <input type="text" id="bcontent" name="bcontent" class="form-control readonly""/>
    </div>
    
    <div class="form-group">
     <a href ="edit.jsp" title=수정링크이동"" class="btn btn-danger form-control"></a>
     <a href ="" title="삭제링크이동" class="btn btn-default form-control"></a>
     <a href ="list.jsp" title="목록링크이동" class="btn btn-default form-control"></a>
    </div>
    
   </fieldset>
   </form>
</body>
</html>