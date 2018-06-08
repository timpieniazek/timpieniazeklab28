<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
</head>
<body class="text-center">
	<div class="container mt-5">
		<h1>Hello World</h1>
	</div>
	<div class="container mt-5">
		<h1>${deck }</h1>
	</div>
	<div class="container mt-5">

		<table class="table table-hover table-sm table-bordered">
			<tr>
				<c:forEach var="item" items="${deck.cards }">
					<td><img src=${item.image } height=100px></td>
				</c:forEach>
			</tr>
		</table>
	</div>

	<!-- 
	<c:forEach var="item" items="items">
					
	</c:forEach>
 -->
</body>
</html>