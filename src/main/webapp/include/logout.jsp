<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String nickname = null;
	nickname = (String)session.getAttribute("nickname");
%>
<%=nickname %>
        <!-- 로그인 성공시 세션에 담긴 이름을 출력하고 로그인 성공한 경우이므로 로그아웃 버튼 추가함 -->
<%
	if(nickname != null) {
%>
	<form class="d-flex mb-2 mb-lg-0" role="search">
		<div class="me-auto mt-2 mb-lg-0"><%=nickname %>님.&nbsp;</div>
		<!-- 
		button클릭을 했을 때 onclick은 이벤트 핸들러 이름이다.
		클릭이 되면 느끼는 것은 브라우저 화면
		감지하는 건 js처리를 해야함 - 이벤트 처리 담당은 자바스크립트 처리함
		 -->
		<input type="button" onclick="logout()" class="btn btn-outline-success" value="로그아웃">
	</form>
	<script type="text/javascript">
	//아래 함수는 로그아웃 버튼이 눌렸을 때 호출됨
		const logout = () => {
			console.log('11');//출력이 된다면 호출성공했다는 것임
			//페이지 이동 -> get방식 -> 주소창이 바뀐다
			location.href="/auth2/logout.jsp";//세션에 저장된 nickname을 삭제하기 구현
		}
	</script>
<%
	}
%>
