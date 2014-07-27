<%@ include file="/WEB-INF/jsp/include.jsp" %>
<html>
<head>
    <title>Sudent Info System-Student Information</title>
</head>
<body>
<h2>Student Information</h2>
<form:form method="post" action="addStudent" commandName="student">
    <table>
        <tr>
            <td><form:label path="firstname"><spring:message code="label.firstname"/></form:label></td>
            <td><form:input path="firstname" /></td>
        </tr>
        <tr>
            <td><form:label path="lastname"><spring:message code="label.lastname"/></form:label></td>
            <td><form:input path="lastname" /></td>
        </tr>
        <tr>
            <td><form:label path="email"><spring:message code="label.email"/></form:label></td>
            <td><form:input path="email" /></td>
        </tr>
        <tr>
            <td><form:label path="telephone"><spring:message code="label.telephone"/></form:label></td>
            <td><form:input path="telephone" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="<spring:message code="label.addcontact"/>"/>
            </td>
        </tr>
    </table>
</form:form>

<h3>Contact List</h3>
<c:if  test="${!empty studentList}">
    <table class="data">
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Telephone</th>
            <th>&nbsp;</th>
        </tr>
        <c:forEach items="${studentList}" var="student">
            <tr>
                <td>${student.lastname}, ${student.firstname} </td>
                <td>${student.email}</td>
                <td>${student.telephone}</td>
                <td><a href="deleteStudent/${student.id}">delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>