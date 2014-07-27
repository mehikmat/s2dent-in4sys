<%@ include file="/WEB-INF/jsp/include.jsp" %>
<h1>This is header template</h1>
<c:if test="${pageContext.request.userPrincipal.name != null}">
    <h2>Welcome : ${pageContext.request.userPrincipal.name}
        | <a href="<c:url value="/logout"/>">Logout</a></h2>
</c:if>