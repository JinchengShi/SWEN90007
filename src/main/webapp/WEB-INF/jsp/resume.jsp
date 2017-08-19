<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Resume Management</title>
</head>
<body>
	<h1>Resumes Data</h1>
	<form:form action=".do" method="POST" commandName="resume">
		<table>
			<tr>
				<td>Resume ID</td>
				<td><form:input path="idResume" /></td>
			</tr>
			<tr>
				<td>First name</td>
				<td><form:input path="firstname" /></td>
			</tr>
			<tr>
				<td>Last name</td>
				<td><form:input path="lastname" /></td>
			</tr>
			<tr>
				<td>Age</td>
				<td><form:input path="age" /></td>
			</tr>
			<tr>
				<td>Phone</td>
				<td><form:input path="phone" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>Education</td>
				<td><form:input path="education" /></td>
			</tr>
			<tr>
				<td>Experience</td>
				<td><form:input path="experience" /></td>
			</tr>
			<tr>
				<td>Honor</td>
				<td><form:input path="honor" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="action" value="Add" />
					<input type="submit" name="action" value="Edit" /> <input
					type="submit" name="action" value="Delete" /> <input type="submit"
					name="action" value="Search" /></td>
			</tr>
		</table>
	</form:form>
	<br>
	<table border="1">
		<th>ID</th>
		<th>First name</th>
		<th>Last name</th>
		<th>Age</th>
		<th>Phone</th>
		<th>Email</th>
		<th>Education</th>
		<th>Experience</th>
		<th>Honor</th>
		<c:forEach items="${resumeList}" var="resume">
			<tr>
				<td>${resume.idResume}</td>
				<td>${resume.firstname}</td>
				<td>${resume.lastname}</td>
				<td>${resume.age}</td>
				<td>${resume.phone}</td>
				<td>${resume.email}</td>
				<td>${resume.education}</td>
				<td>${resume.experience}</td>
				<td>${resume.honor}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>