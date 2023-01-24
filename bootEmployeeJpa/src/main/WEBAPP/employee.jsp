<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>employee</title>
</head>
<body>
<h1>To Save Employee Details</h1>
 <form method="post" action="details">
  <table>
    <tr><td> Employee Name:</td><td><input type="text" name="Name"></td></tr>
     <tr><td> Employee Email:</td><td><input type="email" name="Email"></td></tr>
      <tr><td> Employee Address:</td><td><input type="text" name="Address"></td></tr>
       <tr><td> Employee Department:</td><td><input type="text" name="Department"></td></tr>
       <tr><td> Employee Designation:</td><td><input type="text" name="Designation"></td></tr>
        <tr><td><input type="submit" value="submit"></td></tr>
  </table>
 </form>
 <br>
 <br>
 <h1>To Retrive Employee Details</h1>
 <form method="post" action="retrive">
  <table>
    <tr><td> Employee Id:</td><td><input type="text" name="Id"></td></tr>
     <tr><td> Employee Name:</td><td><input type="text" name="Name"></td></tr>
     
        <tr><td><input type="submit" value="retrive"></td></tr>
        </table>
        </form>
        
        <br>
        <br>
         <h1>Which Employee Address Wants You Update?</h1>
  <form method="post" action="update">
  <table>
    <tr><td> Employee Id:</td><td><input type="text" name="Id"></td></tr>
     <tr><td> Employee Name:</td><td><input type="text" name="Name"></td></tr>
      <tr><td> Enter Address Wants You Set:</td><td><input type="text" name="Address"></td></tr>
     
        <tr><td><input type="submit" value="update"></td></tr>
        
        
  </table>
 </form>
 <br>
 <br>
 
 <h1>Which Employee You Wants You Delete?</h1>
 
 <form method="post" action="delete">
  <table>
    <tr><td> Employee Id:</td><td><input type="text" name="Id"></td></tr>
     <tr><td> Employee Name:</td><td><input type="text" name="Name"></td></tr>
      
     
        <tr><td><input type="submit" value="delete"></td></tr>
        
        
  </table>
 </form>
</body>
</html>