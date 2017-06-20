package com.kedu.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kedu.board.dao.BoardDao;
import com.kedu.board.dto.BoardDto;
import com.kedu.board.dto.SearchCriteria;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDao dao;
	
	@Override
	public void regist(BoardDto bDto) throws Exception {
		dao.create(bDto);
	}

	@Transactional
	@Override
	public BoardDto read(Integer bno) throws Exception {
		return dao.read(bno);
	}

	@Override
	public void modify(BoardDto bDto) throws Exception {
		dao.update(bDto);
	}

	@Override
	public void remove(Integer bno) throws Exception {
		dao.delete(bno);
	}
	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		return dao.listSearchCount(cri);
	}

	@Override
	public List<BoardDto> listSearchCriteria(SearchCriteria cri) throws Exception {
		return dao.listSearch(cri);
	}
	
/*
	@Override
	public List<BoardDto> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public List<BoardDto> listCriteria(Criteria cri) throws Exception {
		return dao.listCriteria(cri);
	}

	@Override
	public int listCountCriteria(Criteria cri) throws Exception {
		return dao.countPaging(cri);
	}


*/
	
}
