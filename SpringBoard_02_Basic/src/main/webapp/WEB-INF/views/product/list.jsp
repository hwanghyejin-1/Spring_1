<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<jsp:include page="../00_header.jsp"></jsp:include>
<jsp:include page="../10_nav.jsp"></jsp:include>
<p class="text-right">
	<a href="/product/write" class="btn btn-outline-primary">상품등록</a> 





<script>
	let result = '<c:out value="${result}" />';
	if(result == 'Write_ok'){
		alert("상품 등록이 완료되었습니다~!");
	}
	result = "";
</script>
<jsp:include page="../90_footer.jsp"></jsp:include>
