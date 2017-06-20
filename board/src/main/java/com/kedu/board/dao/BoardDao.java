package com.kedu.board.dao;

import java.util.List;

import com.kedu.board.dto.BoardDto;
import com.kedu.board.dto.SearchCriteria;

public interface BoardDao {

	public void create(BoardDto bDto) throws Exception;
	
	public BoardDto read(Integer bno) throws Exception;
	
	public void update(BoardDto bDto) throws Exception;
	
	public void delete(Integer bno) throws Exception;
	
	public List<BoardDto> listSearch(SearchCriteria cri) throws Exception;
	
	public int listSearchCount(SearchCriteria cri) throws Exception;


/*	
	public List<BoardDto> listAll() throws Exception;
	
	public List<BoardDto> listPage(int page) throws Exception;
	
	public List<BoardDto> listCriteria(Criteria cri) throws Exception;
	
	public int countPaging(Criteria cri) throws Exception;

*/	
}
