<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Self Help Link Update Form</title>
	<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>

<body>
 	<div class="generic-container">
		<%@include file="authheader.jsp" %>

		<div class="well lead">Self Help Link Update Form</div>
	 	<form:form method="POST" modelAttribute="helplinkupdate" class="form-horizontal">
			<form:input type="hidden" path="id" id="id"/>
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="url">APP URL</label>
					<div class="col-md-7">
						<form:input type="text" path="url" id="url" class="form-control input-sm"/>
						<div class="has-error">
							<form:errors path="url" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
	
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="filedid">Field Id</label>
					<div class="col-md-7">
						<form:input type="text" path="filedid" id="filedid" class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="filedid" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
	
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="applicationname">Application Name</label>
					<div class="col-md-7">
						<form:input type="text" path="applicationname" id="applicationname" class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="filedid" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="value">Value</label>
					<div class="col-md-7">
						<form:input type="text" path="value" id="value" class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="value" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
	
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="helplink">Self Help Link</label>
					<div class="col-md-7">
						<form:input type="text" path="helplink" id="helplink" class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="helplink" class="help-inline"/>
						</div>
					</div>
				</div>
			</div>
	        <div class="row">
				<div class="form-actions floatRight">
					<c:choose>
						<c:when test="${edit}">
							<input type="submit" value="Update" class="btn btn-primary btn-sm"/> or <a href="<c:url value='/list' />">Cancel</a>
						</c:when>
						<c:otherwise>
							<input type="submit" value="ADD" class="btn btn-primary btn-sm"/> or <a href="<c:url value='/list' />">Cancel</a>
						</c:otherwise>
					</c:choose>
				</div>
			</div>
		</form:form>
	</div>
</body>
</html>