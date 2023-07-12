<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>home.jsp</h1>
<hr>

<h3>Hello, world !!</h3>
<h3>지금은 ${now } 입니다</h3>
<h3>contextPath : ${cpath }</h3>

<ol>
<li>라이브러리 의존성을 pom.xml이 처리한다</li>
<li>스프링 프레임워크에서 JSTL은 기본 스펙 포함이므로, 라이브러리를 복사해서 넣을 필요가 없다</li>
<li>Servlet 을 활용하는 JSP Model 2와 달리 HttpServlet을 상속하지 않아도 된다</li>
<li>모든 요청은 DispatcherServlet이 처리한다</li>
<li>상세 내용은 Servlet을 상속받지 않는 개별 컨트롤러가 처리한다</li>
<li>컨트롤러에서 원하는 객체를 모두 JSP로 간단하게 넘길 수 있다</li>
<li>JSP에서는 넘어오는 객체를 활용하여 보여주는 페이지만 구성하면 된다</li>
</ol>
</body>
</html>