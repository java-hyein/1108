<%@ page import ="java.util.ArrayList"%>
<%@ page import = "edu.bit.ex.*"%>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		MemberPoolDAO memberDAO = new MemberPoolDAO();
		//어레이 리스트로 dtos 값 리턴 (이 부분 이해하기)
		ArrayList<MemberDTO> dtos = memberDAO.memberSelect();
		
		for(int i = 0; i <dtos.size(); i++){
			MemberDTO dto = dtos.get(i); // DTO 내용 받아오기
			String name = dto.getName();
			String id = dto.getId();
			String pw = dto.getPw();
			String phone = dto.getPhone1()+ " - "+ dto.getPhone2()+ " - " + dto.getPhone3();
			String gender = dto.getGender();
			
			out.println("이름 : " + name +", 아이디 : "+ id + ", 비밀번호 : " + pw + ", 연락처 : "+ phone +", 성별 : " + gender +"<br>");
		}
	%>
</body>
</html>