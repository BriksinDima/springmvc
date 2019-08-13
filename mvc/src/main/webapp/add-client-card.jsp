<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link href="<spring:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    <script type=text/javascript" src="<spring:url value="/resources/js/bootstrap.bundle.min.js" />"></script>
</head>
<body>


<form:form action="${pageContext.request.contextPath}/controller/addClientCard" method="POST" modelAttribute="clientCard">
    <div class="form-row  col-md-4">



    <div class="form-group col-md-4">
        <form:label path="borrower.gender" for="inputState">Gender</form:label>
        <div> <form:radiobutton path="borrower.gender" value="FEMALE" /> Female </div> <div><form:radiobutton path="borrower.gender" value="MALE" /> Male </div>
    </div>

    </div>
    <div class="form-group col-md-4">
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

    <div class="form-group col-md-4">
       <form:label path="borrower.personalData.birthDate"  for="inputAddress">Birthday</form:label>
       <form:input path="borrower.personalData.birthDate"  class="form-control" id="inputAddress" placeholder="Birthday"/>
    </div>
    <div class="form-group col-md-4">
        <form:select path="borrower.personalData.employmentTypeId" class="custom-select custom-select-sm">
           <form:option value="0" label="--- Select ---"/>
           <form:options value="1" label="Госслужащий" />
           <form:options value="2" label="Военнослужащий" />
           <form:options value="3" label="Наемный рабочий" />
        </form:select>
    </div>
    <div class="form-group col-md-4">
        <div class="form-group">
            <div class="form-check">
                <form:label path="borrower.personalData.cardHolder" class="form-check-input" type="checkbox" id="gridCheck2"/>
                <form:checkbox path="borrower.personalData.cardHolder" class="form-check-label" for="gridCheck2"/>
                     Card holder
                </label>
            </div>
        </div>
    </div>

    <div class="form-group col-md-4">
            <div class="form-group">
                <div class="form-check">
                    <form:label path="borrower.personalData.incomeStatement" class="form-check-input" type="checkbox" id="gridCheck3"/>
                    <form:checkbox path="borrower.personalData.incomeStatement" class="form-check-label" for="gridCheck3"/>
                         Income statement
                    </label>
                </div>
            </div>
        </div>


    <h2>Sub-borrower data</h2>

    <div class="form-group col-md-4">
       <form:label path="subBorrower.personalData.birthDate"  for="inputAddress">Birthday</form:label>
       <form:input path="subBorrower.personalData.birthDate"  class="form-control" id="inputAddress" placeholder="Birthday"/>
    </div>

    <div class="form-group col-md-4">
            <form:select path="subBorrower.personalData.employmentTypeId" class="custom-select custom-select-sm">
               <form:option value="0" label="--- Select ---"/>
               <form:options value="1" label="Госслужащий" />
               <form:options value="2" label="Военнослужащий" />
               <form:options value="3" label="Наемный рабочий" />
            </form:select>
        </div>

    <div class="form-group col-md-4">
        <div class="form-group">
            <div class="form-check">
                <form:label path="subBorrower.personalData.cardHolder" class="form-check-input" type="checkbox" id="gridCheck3"/>
                <form:checkbox path="subBorrower.personalData.cardHolder" class="form-check-label" for="gridCheck3"/>
                     Sub Borrower Card Holder
                </label>
            </div>
        </div>
     </div>
    <div class="form-group col-md-4">
        <div class="form-group">
            <div class="form-check">
                <form:label path="subBorrower.personalData.incomeStatement" class="form-check-input" type="checkbox" id="gridCheck3"/>
                <form:checkbox path="subBorrower.personalData.incomeStatement" class="form-check-label" for="gridCheck3"/>
                     Sub Borrower Income statement
                </label>
            </div>
        </div>
     </div>
    <button type="submit" class="btn btn-primary">Submit</button>


</form:form>

</body>
</html>
