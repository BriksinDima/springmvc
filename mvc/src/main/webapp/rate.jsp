<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link href="<spring:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    <script type=text/javascript" src="<spring:url value="/resources/js/bootstrap.bundle.min.js" />"></script>
</head>
<body>

     <div class="form-row  col-md-4">
            <div class="form-group col-md-4">
                <h2>Rate is {rate}</h2>
            </div>
        </div>

        <a href="${pageContext.request.contextPath}/controller/clientcards"><<return</a>
</body>
</html>
