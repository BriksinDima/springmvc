<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
    <link href="<spring:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    <script type=text/javascript" src="<spring:url value="/resources/js/bootstrap.bundle.min.js" />"></script>
</head>
<body>

<h3>Client card list</h3>

<hr>

<table  class="table">
<thead>
<tr>
    <th scope="col">Gender</th>
    <th scope="col">Married</th>
    <th scope="col">Children</th>
    <th scope="col">Birth Date</th>
    <th scope="col">Employment Type Id</th>
    <th scope="col">Card Holder</th>
    <th scope="col">Income Statement<th>
</tr>
</thead>
<tbody>
<c:forEach items="${clientCards}" var="clientCard">
    <tr scope="row">
        <td><c:out value="${clientCard.borrower.gender}"/></td>
        <td><c:out value="${clientCard.borrower.married}"/></td>
        <td><c:out value="${clientCard.borrower.children}"/></td>
        <td><c:out value="${clientCard.borrower.personalData.birthDate}"/></td>
        <td><c:out value="${clientCard.borrower.personalData.employmentTypeId}"/></td>
        <td><c:out value="${clientCard.borrower.personalData.cardHolder}"/></td>
        <td><c:out value="${clientCard.borrower.personalData.incomeStatement}"/></td>
        <td><a href="${pageContext.request.contextPath}/controller/clientCards/${clientCard.id}">more details</a></td>
        <td>
        <a href="${pageContext.request.contextPath}/controller/delete/${clientCard.id}">more details</a>
        </td>
    </tr>
</c:forEach>
</tbody>
</table>

<a href="${pageContext.request.contextPath}/controller/addClientCard">add client card</a>


</body>
</html>