<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <!-- Theme Made By www.w3schools.com -->
  <title>boader header</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style>
.wapper{

}

.header{
 width: 100px; height: 100px; background-color: pink; font-size: 30px;
 text-align: center; line-height: 100px;
}
.main{
 flex-grow : 1;
}

.footer{
 width: 100%; height: 100px; background-color: pink; font-size: 30px;
 text-align: center; line-height: 100px; 
}

 .container{
      display: flex;
      flex-direction: column; /* 세로 방향으로 정렬 */
    }

 .btn{
      margin-top: auto; /* 아래로 버튼을 이동시킴 */
    }
    
 .ul{
   flex-direction: row;
 }
</style> 
</head>
<body>
  <div>
  <header>
  
  <nav class="navbar navbar-default">
  <div class="contain-fluid">
  <div class="navar-header">
  <a class="navbar boader">DBDBIG</a>
  
  </div>
  <ul class="navbar ul">
   <li><a href=""></a>Sign up</li>
   <li><a href=""></a>Login</li>
  </ul>
  </div>
  </nav>
  
  <header>
  
  </div>


  <div class="container panel panel-warning">
     <h3 class="panel-heading">MULTIBOARD</h3>
     <table class="table table-bordered">
     <caption>MULTIBOARD - MVC1</caption>
     <thead> 
       <tr>
        <th scope="col">NO</th>
        <th scope="col">TITLE</th>
        <th scope="col">WRITER</th>
        <th scope="col">DATE</th>
        <th scope="col">HIT</th>
       </tr>
     </thead>
     <tbody>
     </tbody>
     <tfoot>
      <tr class="text-right">
       <td>
        <a href="write.jsp" title="" class="btn btn-danger">글쓰기</a>
       </td>
     </tfoot>
     
     
     
     </table>
   
     

  </div>
</body>