<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ include file="../include/header.jsp" %>
	<div class="box-body">
		<select name="searchType">
			<option value="n" 
				<c:out value="${cri.searchType == null? 'selected' : '' }"/>>
				---
			</option>
			<option value="t" 
				<c:out value="${cri.searchType eq 't'? 'selected' : '' }"/>>
				Title
			</option>
			<option value="c" 
				<c:out value="${cri.searchType eq 'c'? 'selected' : '' }"/>>
				Content
			</option>
			<option value="w" 
				<c:out value="${cri.searchType eq 'w'? 'selected' : '' }"/>>
				Writer
			</option>
			<option value="tc" 
				<c:out value="${cri.searchType eq 'tc'? 'selected' : '' }"/>>
				Title OR Content
			</option>
			<option value="cw" 
				<c:out value="${cri.searchType eq 'cw'? 'selected' : '' }"/>>
				Content OR Writer
			</option>
			<option value="tcw" 
				<c:out value="${cri.searchType eq 'tcw'? 'selected' : '' }"/>>
				Title OR Content OR Writer
			</option>
		</select>
		
		<input type="text" name="keyword" id="keywordInput" value="${cri.keyword }">
			<button id="searchBtn">Search</button>
			<button id="newBtn">New Board</button>
		
	</div>
	<div class="box-body">
		<table class="table table-bordered">
			<tr>
				<th style="width: 10px;">BNO</th>
				<th>TITLE</th>
				<th>WRITER</th>
				<th>REGDATE</th>
				<th style="">VIEWCNT</th>
			</tr>
			<c:forEach var="boardVo" items="${list }">
				<tr>
					<td>		                   ${boardVo.bno     }</td>
					<td>
						<a href="/sboard/read${pageMaker.makeSearch(pageMaker.cri.page)}&bno=${boardVo.bno}">
                        	${boardVo.title   }<strong>[ ${boardVo.replycnt } ]</strong>
						</a>
					</td>
					<td>		                   ${boardVo.writer  }</td>
					<td><fmt:formatDate value=    "${boardVo.regdt   }" pattern="yyyy-MM-dd HH:mm"/> </td>
					<td><span class="badge bg-red">${boardVo.viewcnt }</span></td>
				</tr>
			</c:forEach>
		</table>
	</div>

	<div class="text-center">
		<ul	class="pagination">
			<c:if test="${pageMaker.prev }">
				<li><a href="list${pageMaker.makeSearch(pageMaker.startPage - 1)}">&laquo;</a></li>
			</c:if>
			<c:forEach begin="${pageMaker.startPage }" 
					   end="${pageMaker.endPage }" 
					   var="idx">
				<li <c:out value="${pageMaker.cri.page == idx? 'class=active' : '' }"/>>
					<a href="list${pageMaker.makeSearch(idx) }">${idx }</a>
				</li>
			</c:forEach>
 		
			<c:if test="${pageMaker.next && pageMaker.endPage > 0 }">
				<li>
					<a href="list${pageMaker.makeSearch(pageMaker.endPage + 1)}">&raquo;</a>
				</li>
			</c:if>
		</ul>
	</div>
<%@ include file="../include/footer.jsp" %>

<script type="text/javascript">
	$(document).ready(function(){
		$("#searchBtn").on("click", function(event){
			self.location = "list"
						  + "${pageMaker.makeQuery(1)}"
						  + "&searchType="
						  + $("select option:selected").val()
						  + "&keyword="
						  + encodeURIComponent($("#keywordInput").val());
		});
		
		$("#newBtn").on("click", function(evt){
			self.location = "register";
		});
	});
</script>