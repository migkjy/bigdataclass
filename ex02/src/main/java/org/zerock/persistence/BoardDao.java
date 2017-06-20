package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.BoardVo;
import org.zerock.domain.Criteria;
import org.zerock.domain.SearchCriteria;

/*****************************
 * <pre>
 * org.zerock.persistence
 * BoradDAO.java
 * </pre>
 * @author : 김준영
 * @date   : 2017. 4. 19.
 * @version: 1.0
 *****************************/
public interface BoardDao {

	/************************************
	 * <pre>
	 * 1. 개요        : 게시글 등록
	 * 2. 처리내용  : 게시글 데이터베이스에 Insert 
	 * </pre>
	 * @Method name : create
	 * @param       : BoardVo vo
	 * @throws Exception
	 ************************************/
	public void create(BoardVo vo) throws Exception;
	
	
	/************************************
	 * <pre>
	 * 1. 개요       : 게시글 읽기
	 * 2. 처리내용  : 데이터베이스에서 게시글 select
	 * </pre>
	 * @Method name : read
	 * @param       : Integer bno(글번호)
	 * @return      : BoardVo vo
	 * @throws Exception
	 ************************************/
	public BoardVo read(Integer bno) throws Exception;

	
	/************************************
	 * <pre>
	 * 1. 개요       : 게시글 수정
	 * 2. 처리내용  : 데이터베이스에서 게시글 수정
	 * </pre>
	 * @Method name : update
	 * @param       : BoardVo vo
	 * @throws Exception
	 ************************************/
	public void update(BoardVo vo) throws Exception;
	
	
	/************************************
	 * <pre>
	 * 1. 개요       : 게시글 삭제
	 * 2. 처리내용  : 데이터베이스에서 게시글 삭제
	 * </pre>
	 * @Method name : delete
	 * @param       : Integer bno(글번호)
	 * @throws Exception
	 ************************************/
	public void delete(Integer bno) throws Exception;
	
	
	/************************************
	 * <pre>
	 * 1. 개요       : 게시글 목록
	 * 2. 처리내용  : 데이터베이스에서 게시글 목록 처리
	 * </pre>
	 * @Method name : listAll
	 * @return      : List<BoardVo>
	 * @throws Exception
	 ************************************/
	public List<BoardVo> listAll() throws Exception;
	
	/************************************
	 * <pre>
	 * 1. 개요       :
	 * 2. 처리내용  :
	 * </pre>
	 * @Method name : listPage
	 * @param page
	 * @return
	 * @throws Exception
	 ************************************/
	public List<BoardVo> listPage(int page) throws Exception;
	
	/************************************
	 * <pre>
	 * 1. 개요       :
	 * 2. 처리내용  :
	 * </pre>
	 * @Method name : listCriteria
	 * @param cri
	 * @return
	 * @throws Exception
	 ************************************/
	public List<BoardVo> listCriteria(Criteria cri) throws Exception; 
	
//	countRecord가 더 적합하다.
	/************************************
	 * <pre>
	 * 1. 개요       :
	 * 2. 처리내용  :
	 * </pre>
	 * @Method name : countPaging
	 * @param cri
	 * @return
	 * @throws Exception
	 ************************************/
	public int countPaging(Criteria cri) throws Exception;
	
	/************************************
	 * <pre>
	 * 1. 개요       :
	 * 2. 처리내용  :
	 * </pre>
	 * @Method name : listSearch
	 * @param cri
	 * @return
	 * @throws Exception
	 ************************************/
	public List<BoardVo> listSearch(SearchCriteria cri) throws Exception;
	
	/************************************
	 * <pre>
	 * 1. 개요       :
	 * 2. 처리내용  :
	 * </pre>
	 * @Method name : listSearchCount
	 * @param cri
	 * @return
	 * @throws Exception
	 ************************************/
	public int listSearchCount(SearchCriteria cri) throws Exception;
	
	public void updateReplyCnt(Integer bno, int amount) throws Exception;
	
	public void updateViewCnt(Integer bno) throws Exception;
	
	public void addAttach(String fullName) throws Exception;
	
	public List<String> getAttach(Integer bno) throws Exception;
	
}
