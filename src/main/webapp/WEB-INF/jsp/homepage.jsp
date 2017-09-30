<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head></head>

<body>
    <h1>This is the body of the Homepage</h1>

    <security:authorize access="hasRole('ROLE_JOBSEEKER')">
        This text is only visible to a job seeker
        <br/> <br/>
        <a href="<c:url value="/jobseeker/jobseekerpage.html" />">JobSeeker Page</a>
        <br/> <br/>
    </security:authorize>
	
    <security:authorize access="hasRole('ROLE_ADVISOR')">
        This text is only visible to an advisor
        <br/>
        <a href="<c:url value="/advisor/advisorpage.html" />">Advisor Page</a>
        <br/>
    </security:authorize>

    <a href="<c:url value="/perform_logout" />">Logout</a>

</body>
</html>