<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">

<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>



<title>Insert title here</title>
</head>
<body>
	<div class = "container">
		<div class="page-header" style = "text-align : center">
		    <h1>This is board</h1> 
		    <p>( this page is where you can see the list of mvc_board )</p>     
		  </div>
	    
		<div class = "table-responsive-md">
			<table class= "table table-striped table-hover">
		<thead>
		<tr class= "table-primary" style ="text-align:center">
			<th>번호</th>
			<th>이름</th>
			<th>제목</th>
			<th>날짜</th>
			<th>조회수</th>
		</tr>
		</thead>
		<!-- items="${list}" : request.setAttribute("list", dtos); 에서 온 것 
		 변수 dto-->
		 <tbody>
			<c:forEach items="${list}" var="dto">
			<tr>
				<!-- dto.getbId -->
				<td>${dto.bId}</td>
				<td>${dto.bName}</td>
				<td>
					<c:forEach begin="1" end="${dto.bIndent}">└</c:forEach>
					<a href="content_view.do?bId=${dto.bId}">${dto.bTitle}</a></td>
				<td>${dto.bDate}</td>
				<td>${dto.bHit}</td>
			</tr>
		</c:forEach>
			<tr>
			<td colspan = '5'>
				<button type="button" class="btn btn-success btn-block">
					 <a style = "color:white" href="write_view.do">글작성</a> 
				</button>
			</td>
			</tr>
		</tbody>
	</table>
	</div>
	</div>
</body>
</html>