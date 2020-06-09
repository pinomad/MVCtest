package com.board.service;

import java.util.List;

import com.board.domain.BoardVO;

public interface BoardService {
	// 게시물 목록
	public List<BoardVO> list() throws Exception;
	// 게시물작성
	public void write(BoardVO vo) throws Exception;
}
