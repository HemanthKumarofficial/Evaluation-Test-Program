<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
 
<html>
<head>
<h2>
<center>
Web Application
</center>
   </h2>
      <title>CRUD</title>
   </head>

   <body>
      <sql:setDataSource var = "snapshot" driver = "com.mysql.cj.jdbc.Driver"
         url = "jdbc:mysql://localhost/employeedb"
         user = "dbboy"  password = "challenge"/>
 
      <sql:query dataSource = "${snapshot}" var = "result">
         SELECT * from Employees;
      </sql:query>
 
      <center><table border="3"></center>
       <tr>
       <button onclick="myFunction()">CREATE</button>
       <button onclick="myFunction()">READ</button>
       <button onclick="myFunction()">UPDATE</button>
       <button onclick="myFunction()">DELETE</button>
       <br></br>
         <thead>
            <th style="color:blue;">Employee ID</th>
            <th style="color:blue;">First Name</th>
            <th style="color:blue;">Last Name</th>
            <th style="color:blue;">Email</th>
            <th style="color:blue;">Phone</th>
            <th style="color:blue;">Hire Date</th>
            <th style="color:blue;">Job Id</th>
            <th style="color:blue;">Salary</th>
            <th style="color:blue;">Manager Id</th>
            <th style="color:blue;">Department Id</th>
         </tr>
         </thead>
         <c:forEach var = "row" items = "${result.rows}">
         <tbody>
            <tr>
               <td><c:out value = "${row.employee_id}"/></td>
               <td><c:out value = "${row.first_name}"/></td>
               <td><c:out value = "${row.Last_name}"/></td>
               <td><c:out value = "${row.email}"/></td>
               <td><c:out value = "${row.phone_number}"/></td>
               <td><c:out value = "${row.hire_date}"/></td>
               <td><c:out value = "${row.job_id}"/></td>
               <td><c:out value = "${row.salary}"/></td>
               <td><c:out value = "${row.manager_id}"/></td>
               <td><c:out value = "${row.department_id}"/></td>
            </tr>
         </c:forEach>
         </tbody>
        </table>
        <p id="demo"></p>
        <script>
function myFunction() {
  document.getElementById("demo").innerHTML = "Hello World";
}
</script>
        
   </body>
</html>