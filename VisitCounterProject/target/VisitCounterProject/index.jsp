<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Visit Counter</title>
</head>
<body>
    <h1>Welcome to the Website</h1>
    <p>SO LAN VAO TRANG web: <c:out value="${applicationScope.visitCount}" /></p>
    
    <c:if test="${applicationScope.visitCount > 10}">
        <p style="color: red;">Wow! This site is getting popular with over 10 visits!</p>
    </c:if>
</body>
</html>