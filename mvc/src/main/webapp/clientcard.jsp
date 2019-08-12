<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>

<h3>Spring CRM REST Demo</h3>

<hr>

<h3>client card </h3>

</body>
    <table>
        <tbody>
         <tr> <td>Gedner</td>        <td><c:out value="${clientCard.borrower.gender}"/></td> </tr>
          <tr> <td>Married</td>        <td><c:out value="${clientCard.borrower.married}"/></td></tr>
          <tr> <td>Children</td>        <td><c:out value="${clientCard.borrower.children}"/></td></tr>
          <tr> <td>BirthDate</td>        <td><c:out value="${clientCard.borrower.personalData.birthDate}"/></td></tr>
          <tr> <td>employmentTypeId</td>        <td><c:out value="${clientCard.borrower.personalData.employmentTypeId}"/></td></tr>
          <tr> <td>cardHolder</td>        <td><c:out value="${clientCard.borrower.personalData.cardHolder}"/></td></tr>
          <tr> <td>incomeStatementId</td>        <td><c:out value="${clientCard.borrower.personalData.incomeStatementId}"/></td></tr>

          <tr> <td>Sub-borrower BirthDate</td>        <td><c:out value="${clientCard.subBorrower.personalData.birthDate}"/></td></tr>
          <tr> <td>Sub-borrower employmentTypeId</td>        <td><c:out value="${clientCard.subBorrower.personalData.employmentTypeId}"/></td></tr>
          <tr> <td>Sub-borrower cardHolder</td>        <td><c:out value="${clientCard.subBorrower.personalData.cardHolder}"/></td></tr>
          <tr> <td>Sub-borrower incomeStatementId</td>        <td><c:out value="${clientCard.subBorrower.personalData.incomeStatementId}"/></td></tr>

          <tr> <td>Goal</td>        <td><c:out value="${clientCard.goal.typeId}"/></td></tr>
          <c:forEach items="${clientCard.applicationList}" var="application">
             <tr> <td>Application salary </td>        <td><c:out value="${application.salary}"/></td></tr>
             <tr> <td>Application duration </td>        <td><c:out value="${application.duration}"/></td></tr>
          </c:forEach>
        </tbody>
    </table>
</html>