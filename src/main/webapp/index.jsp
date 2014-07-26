<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Spring Web MVC Application</title>
</head>
<body>
<H1>Welcome to the User Home!</H1>
<c:if test="${pageContext.request.userPrincipal.name != null}">
    <h2>Welcome : ${pageContext.request.userPrincipal.name}
        | <a href="<c:url value="/index.jsp" />" > Logout</a></h2>
</c:if>
<p>This is Home page</p>
</body>
</html>