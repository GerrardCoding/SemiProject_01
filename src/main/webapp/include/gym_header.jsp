<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	//스크립틀릿 - 자바코드를 작성할 수 있는 영역
	//여기서는 메소드를 선언할 수 없다.
	//여기서 선언한 변수는 서블릿 코드의 doService메소드 안에 들어가므로 모두 지변이다
	//인스턴스화 나 변수 선언 제어문 사용은 가능하다
	//KakaoController에서 세션에 저장해둔 이름 가져오기
	String nickname = null;
	nickname = (String)session.getAttribute("nickname");
	//out.print(nickname);//출력하는 여기는 html땅
%>
<%=nickname %>
<nav class="navbar navbar-expand-lg bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="/gym.jsp">TerrGYM</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="/auth2/loginForm.jsp">로그인</a>
       </li>
       <li class="nav-item">
          <a class="nav-link" href="/member/memberCRUD?method=memberSelect">회원관리</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/notice/noticeList.pj1">공지사항</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/board/boardList.pj2">자유게시판</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/member2/memberList.pj2">회원관리2</a>
        </li>
         <li class="nav-item">
          <a class="nav-link" href="#">Q/A게시판</a>
        </li>
       </ul>
        
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
      </div>
  </div>
</nav>