<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Students</title>
</head>
<body>

<h2>Student List</h2>

<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
    </tr>

    <c:forEach var="s" items="${students}">
        <tr>
            <td>${s.id}</td>
            <td>${s.name}</td>
            <td>${s.email}</td>
            <td>
                <a href="/editStudent/${s.id}">Edit</a>
            </td>
        </tr>
    </c:forEach>

</table>

<br/>
<a href="/addStudent">Add New Student</a>

</body>
</html>