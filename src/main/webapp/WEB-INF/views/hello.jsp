<%@ include file="/WEB-INF/views/include.jsp"%>

<html>
<head>
<title><fmt:message key="title" /></title>
</head>
<body>
	<h1>
		<fmt:message key="heading" />
	</h1>
	<p>
		<fmt:message key="greeting" />
		<c:out value="${model.now}" />
	</p>
	<h3>Products</h3>
	<table>
		<c:forEach items="${model.products}" var="prod">
			<tr>
				<td align="right" width="20%"><c:out
						value="${prod.description}" /></td>
				<td align="right" width="60%"><i>$<c:out
							value="${prod.price}" /></i></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<a href="<c:url value="priceincrease.htm"/>">Increase Prices</a>
	<br>
</body>
</html>