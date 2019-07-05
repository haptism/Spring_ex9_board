package com.iu.board;

import java.util.List;

import com.iu.util.PageMaker;

public interface BoardDAO {
	
	//글 등록
	public int getTotalCount(PageMaker pageMaker)throws Exception;
	
	public int setWrite(BoardDTO boardDTO) throws Exception;
	
	public int setDelete(int num)throws Exception;
	
	public int setUpdate(BoardDTO boardDTO) throws Exception;
	
	public BoardDTO getSelect(int num) throws Exception;
	
	public List<BoardDTO> getList(PageMaker pageMaker) throws Exception;
}
