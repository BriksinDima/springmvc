<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link href="<spring:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    <script type=text/javascript" src="<spring:url value="/resources/js/bootstrap.bundle.min.js" />"></script>
</head>
<body>


<form:form action="${pageContext.request.contextPath}/controller/addClientCard" method="POST" modelAttribute="clientCard">
    <div class="form-row">


        <div class="form-group col-md-6">
            <form:label path="borrower.gender"  for="inputEmail4">Gender</form:label>
            <form:input path="borrower.gender"  class="form-control" id="inputEmail4" placeholder="Gender"/>
        </div>


        <div class="form-group">
            <div class="form-check">
                <form:label path="borrower.married" class="form-check-input" type="checkbox" id="gridCheck"/>
                <form:checkbox path="borrower.married" class="form-check-label" for="gridCheck"/>
                    Married
                </label>
            </div>
        </div>
    </div>

    <div class="form-group col-md-4">
        <form:label path="borrower.children" for="inputState">Children amount</form:label>
        <td> <form:radiobutton path="borrower.children" value="NONE" /> 0 <form:radiobutton path="borrower.children" value="ONE" />1 <form:radiobutton
            path="borrower.children" value="TWO" />2 <form:radiobutton path="borrower.children" value="TREEANDMORE" />3</td>
    </div>

    <div class="form-group">
       <form:label path="borrower.personalData.birthDate"  for="inputAddress">Birthday</form:label>
       <form:input path="borrower.personalData.birthDate"  class="form-control" id="inputAddress" placeholder="Birthday"/>
    </div>

    <div class="form-group">
        <div class="form-check">
            <input class="form-check-input" type="checkbox" id="gridCheck">
            <label class="form-check-label" for="gridCheck">
                Card holder
            </label>
        </div>
    </div>


    <div class="form-group">
        <div class="form-check">
            <input class="form-check-input" type="checkbox" id="gridCheck">
            <label class="form-check-label" for="gridCheck">
                Income statement
            </label>
        </div>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form:form>

</body>
</html>
