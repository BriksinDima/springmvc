<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link href="<spring:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    <script type=text/javascript" src="<spring:url value="/resources/js/bootstrap.bundle.min.js" />"></script>
</head>
<body>


<form:form action="${pageContext.request.contextPath}/controller/clientCard/{clientCardId}/saveApplication" method="POST" modelAttribute="application">
    <div class="form-row  col-md-4">
        <div class="form-group col-md-4">
           <form:label path="amount"  for="inputAddress">Birthday</form:label>
           <form:input path="duration"  class="form-control" id="inputAddress" placeholder="Birthday"/>
        </div>
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>
</form:form>

</body>
</html>
