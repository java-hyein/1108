<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

</head>
<body>
	<div class = "container">
		<div class="page-header" style = "text-align : center">
		    <h1>This is write_view</h1> 
		    <p>( this page is where you write content in mvc_board )</p>     
		  </div>
	<div class = "table-responsive-md">
	<table class="table table-bordered table-active">
		<form action="write.do" method="post">
		<tbody>
			<tr>
				<td> 이름 </td>
				<td> <input type="text" name="bName" size = "50"> </td>
			</tr>
			<tr>
				<td> 제목 </td>
				<td> <input type="text" name="bTitle" size = "50"> </td>
			</tr>
			<tr>
				<td> 내용 </td>
				<td> <textarea name="bContent" rows="10" cols="53"></textarea> </td>
			</tr>
			<tr >
				<td colspan="2"> 
				<input type="submit" value="입력"class="btn btn-info btn-sm"> 
				&nbsp;&nbsp; <button type="button" class="btn btn-info btn-sm"><a href="list.do"style = "color:white">목록보기</a></td></button>
			</tr>
		</tbody>
		</form>
	</table>
	</div>   
	</div>
</body>
</html>