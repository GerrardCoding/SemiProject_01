<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- ============================== [[ NavBar section]] ==============================-->
    <script>
	    function main() {
	        document.getElementById("toMain").submit();
    }
	</script>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
      <div class="container-fluid">
        <a class="navbar-brand" href="#" onclick="main()">신발 가게</a>
        <form id="toMain" name="goMain" action="main.do" method="post">
	    	<!-- 메인으로 -->
		</form>
        <button
          class="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarSupportedContent"
          aria-controls="navbarSupportedContent"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav me-auto mb-4 mb-lg-0">
            <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="./main.jsp?menu=menu1">전체 상품</a>
            </li>
	        <li class="nav-item">
	          <a class="nav-link" href="./main.jsp?menu=menu2">Nike</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="./main.jsp?menu=menu3">Adidas</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="./main.jsp?menu=menu4">Mschf</a>
	        </li>
          </ul>
        </div>
      </div>
    </nav>
    <!-- ============================== [[ NavBar section]] ============================== -->