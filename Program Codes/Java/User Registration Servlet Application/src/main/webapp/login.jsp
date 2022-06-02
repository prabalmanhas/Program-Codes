<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>  
<meta charset="ISO-8859-1">
<title>PRABAL MANHAS | PBLJ</title>
</head>
<body>
<body  bgcolor="lightblue"> 
 <div align="center">
  <h1>PRABAL MANHAS 20BCS4513 | PBLJ WORKSHEET 3.3</h1>
  <form action="<%=request.getContextPath()%>/login" method="post">
   <table style="with: 100%">
    <tr>
     <td>UserName</td>
     <td><input type="text" name="username" /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" name="password" /></td>
    </tr>
     <tr>
     <td>Country</td>
     <td><input type="text" name="country" /></td>
    </tr>
     <tr>
     <td>Contact</td>
     <td><input type="text" name=country" /></td>
    </tr>
     <tr>
     <td>Email</td>
     <td><input type="text" name="email" /></td>
    </tr>
    
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>