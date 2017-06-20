package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyDto;

public interface ReplyDao {

	/************************************
	 * <pre>
	 * 1. 개요       : 댓글 읽어오기
	 * 2. 처리내용  : 글번호 받아와서 해당 댓글 목록 불러오기
	 * </pre>
	 * @Method name : list
	 * @param bno
	 * @return
	 * @throws Exception
	 ************************************/
	public List<ReplyDto> list(Integer bno) throws Exception;
	
	/************************************
	 * <pre>
	 * 1. 개요       : 댓글 생성
	 * 2. 처리내용  : 사용자가 입력한 rDto를 받아와서 댓글 생성
	 * </pre>
	 * @Method name : create
	 * @param rDto
	 * @throws Exception
	 ************************************/
	public void create(ReplyDto rDto) throws Exception;
	
	/************************************
	 * <pre>
	 * 1. 개요       : 댓글 수정
	 * 2. 처리내용  : 사용자가 입력한 rDto를 받아와서 댓글 수정
	 * </pre>
	 * @Method name : update
	 * @param rDto
	 * @throws Exception
	 ************************************/
	public void update(ReplyDto rDto) throws Exception;
	
	/************************************
	 * <pre>
	 * 1. 개요       : 댓글 삭제
	 * 2. 처리내용  : 해당하는 댓글 넘버의 댓글 삭제
	 * </pre>
	 * @Method name : delete
	 * @param rno
	 * @throws Exception
	 ************************************/
	public void delete(Integer rno) throws Exception;
	
	public List<ReplyDto> listPage(Integer bno, Criteria cri) throws Exception;
	
	public int count(Integer bno) throws Exception;

	public int getBno(Integer rno) throws Exception;
}
