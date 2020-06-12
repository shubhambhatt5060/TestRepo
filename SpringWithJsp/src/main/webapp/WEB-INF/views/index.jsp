<%@page import="jdk.nashorn.internal.runtime.ListAdapter"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
 
</head>
</head>
<body>
	<div>
	<div>
		<div class="div">
			<span>Currently connected: ${size}</span>
			<a class="allign">Remaining posts:10</a>
			</div>
			<div style="overflow: auto; height: 150px; width: 100%;">
				<table class="table table-bordered" style="width: 100%;"
					cellpadding="0" cellspacing="0">
					<thead>
						<tr bgcolor=#f1f6fa>
							<th>Agent Name</th>
							<th>Tenant Id</th>
							<th>Client Ip</th>
							<th>Server Id</th>
							<th>Session Id</th>
							<th>time Stamp</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${listAgent}" var="agent">
							<tr>
								<td><c:out value="${agent.agentName}" /></td>
								<td><c:out value="${agent.tenantId}" /></td>
								<td><c:out value="${agent.clientIp}" /></td>
								<td><c:out value="${agent.serverId}" /></td>
								<td><c:out value="${agent.sessionId}" /></td>
								<td><c:out value="${agent.timestamp}" /></td>

							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>