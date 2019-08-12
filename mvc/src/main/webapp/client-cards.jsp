<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>

<h3>Client card list</h3>

<hr>

<table>
<thead>
<tr>
    <th>Gender</th>
    <th>Married</th>
    <th>Children</th>
    <th>birthDate</th>
    <th>employmentTypeId</th>
    <th>cardHolder</th>
    <th>incomeStatementId<th>
</tr>
</thead>
<tbody>
<c:forEach items="${clientCards}" var="clientCard">
    <tr>
        <td><c:out value="${clientCard.borrower.gender}"/></td>
        <td><c:out value="${clientCard.borrower.married}"/></td>
        <td><c:out value="${clientCard.borrower.children}"/></td>
        <td><c:out value="${clientCard.borrower.personalData.birthDate}"/></td>
        <td><c:out value="${clientCard.borrower.personalData.employmentTypeId}"/></td>
        <td><c:out value="${clientCard.borrower.personalData.cardHolder}"/></td>
        <td><c:out value="${clientCard.borrower.personalData.incomeStatementId}"/></td>
        <td><a href="${pageContext.request.contextPath}/controller/clientCards/${clientCard.id}">more details</a></td>
        <td>
        <a href="${pageContext.request.contextPath}/controller/delete/${clientCard.id}">more details</a>
        </td>
    </tr>
</c:forEach>
</tbody>
</table>




</body>
</html>