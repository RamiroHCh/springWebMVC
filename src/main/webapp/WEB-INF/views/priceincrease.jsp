<%@ include file="/WEB-INF/views/include.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title><fmt:message key="title" /></title>
<style>
tr{
height: 15px;
}
.error {
	color: red;
}
</style>
</head>
<body>
	<h1>
		<fmt:message key="priceincrease.heading" />
	</h1>
	<form:form method="post" modelAttribute="priceIncrease">
		<table>
			<tr>
				<td align="right" width="20%">Increase (%):</td>
				<td width="20%"><form:input path="percentage" /></td>
				<td width="60%"><form:errors path="percentage" cssClass="error" />
				</td>
			</tr>
			<tr>
				<td align="right"></td>
				<td><input type="submit" value="Execute"></td>
			</tr>
			<tr>
				<td align="right" ></td>
			</tr>
			<tr>
				<td align="right" width="20%">  <a href="<c:url value="hello.htm"/>">Home</a></td>
			</tr>
		</table>
		<br>

	</form:form>

</body>
</html>