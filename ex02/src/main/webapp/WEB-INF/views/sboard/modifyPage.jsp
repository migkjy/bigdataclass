<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>
<!-- Main content -->
<section class="content">
	<div class="row">
		<div class="col-md-12">
			<div class="box box-primary">
				<div class="box-header"> 
					<h3 class="box-title">게시글 수정</h3>
				</div>
				<!-- /.box-header -->
				
				<form role="form" method="post" action="modifyPage">
					<input type="hidden" name="page"       value="${cri.page }">
					<input type="hidden" name="perPageNum" value="${cri.perPageNum }">
					<input type="hidden" name="searchType" value="${cri.searchType}">
					<input type="hidden" name="keyword"    value="${cri.keyword }">
					
					
					<div class="box-body">
						<div class="form-group">
							<label for="exampleInputEmail1">글번호</label>
							<input type="text" name="bno" class="form-control" value="${boardVo.bno }" readonly="readonly">
						</div>					
						<div class="form-group">
							<label for="exampleInputEmail1">제목</label>
							<input type="text" name="title" class="form-control" value="${boardVo.title }">
						</div>
						<div class="form-group">
						 	 <label for="exampleInputPasswrd1">내용</label>
						 	 <textarea rows="3" class="form-control" name="content">${boardVo.content }</textarea>
						</div>
						<div class="form-group">
							<label for="exampleInputEmail1">작성자</label>
							<input type="text" name="writer" class="form-control" value="${boardVo.writer }" readonly="readonly">
						</div>
					</div>
					
					<div class="box-footer">
						<button type="submit" class="btn btn-primary">저장</button>
						<button type="submit" class="btn btn-warning">취소</button>
					</div>
					
				</form>
			</div>
		</div>
	</div>
</section>
<%@ include file="../include/footer.jsp" %>

<script type="text/javascript">
	$(document).ready(function(){
		var formObj =$("form[role='form']");
		
		console.log(formObj);
		
		$(".btn-warning").on("click", function(){
			self.location = "/sboard/list?page=${cri.page}"
									  + "&perPageNum=${cri.perPageNum}"
									  + "&searchType=${cri.searchType}"
									  +    "&keyword=${cri.keyword}";
		});
	
		$(".btn-primary").on("click", function(){
			formObj.submit();
		});
	});
</script>