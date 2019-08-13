<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <link "text/javascript" href="<spring:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    <title>Client Card</title>
</head>
<body>

<h3>Spring CRM REST Demo</h3>

<hr>

<h3>client card </h3>

</body>
    <table class="table">
        <tbody>
         <tr> <td>Gedner</td>        <td><c:out value="${clientCard.borrower.gender}"/></td> </tr>
          <tr> <td>Married</td>        <td><c:out value="${clientCard.borrower.married}"/></td></tr>
          <tr> <td>Children</td>        <td><c:out value="${clientCard.borrower.children}"/></td></tr>
          <tr> <td>Birth Date</td>        <td><c:out value="${clientCard.borrower.personalData.birthDate}"/></td></tr>
          <tr> <td>Employment Type Id</td>        <td><c:out value="${clientCard.borrower.personalData.employmentTypeId}"/></td></tr>
          <tr> <td>Card Holder</td>        <td><c:out value="${clientCard.borrower.personalData.cardHolder}"/></td></tr>
          <tr> <td>Income Statement</td>        <td><c:out value="${clientCard.borrower.personalData.incomeStatement}"/></td></tr>

          <tr> <td>Sub-borrower Birth Date</td>        <td><c:out value="${clientCard.subBorrower.personalData.birthDate}"/></td></tr>
          <tr> <td>Sub-borrower Employment Type Id</td>        <td><c:out value="${clientCard.subBorrower.personalData.employmentTypeId}"/></td></tr>
          <tr> <td>Sub-borrower Card Holder</td>        <td><c:out value="${clientCard.subBorrower.personalData.cardHolder}"/></td></tr>
          <tr> <td>Sub-borrower Income Statement</td>        <td><c:out value="${clientCard.subBorrower.personalData.incomeStatement}"/></td></tr>

          <tr> <td>Goal</td>        <td><c:out value="${clientCard.goal.typeId}"/></td></tr>
          <c:forEach items="${clientCard.applicationList}" var="application">
             <tr> <td>Application salary </td>        <td><c:out value="${application.salary}"/></td></tr>
             <tr> <td>Application duration </td>        <td><c:out value="${application.duration}"/></td></tr>
          </c:forEach>
        </tbody>
    </table>

    <a href="${pageContext.request.contextPath}/controller/clientcards"><<return</a>

</html>