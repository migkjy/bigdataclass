package com.kedu.board.service;

import java.util.List;

import com.kedu.board.dto.BoardDto;
import com.kedu.board.dto.SearchCriteria;

public interface BoardService {
	public void regist(BoardDto bDto)throws Exception;
	
	public BoardDto read(Integer bno) throws Exception;
	
	public void modify(BoardDto bDto) throws Exception;
	
	public void remove(Integer bno) throws Exception;
	
	public int listSearchCount(SearchCriteria cri) throws Exception;
	
	public List<BoardDto> listSearchCriteria(SearchCriteria cri) throws Exception;	

/*	
	public List<BoardDto> listAll() throws Exception;
	
	public List<BoardDto> listCriteria(Criteria cri) throws Exception;
	
	public int listCountCriteria(Criteria cri) throws Exception;
	

*/	
}
