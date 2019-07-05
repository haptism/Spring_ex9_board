package com.iu.board;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.multipart.MultipartFile;

import com.iu.util.PageMaker;

public interface BoardService {
	//글 등록
		public int setWrite(BoardDTO boardDTO, List<MultipartFile> multipartFiles, HttpSession session) throws Exception;
		
		public int setDelete(int num)throws Exception;
		
		public int setUpdate(BoardDTO boardDTO) throws Exception;
		
		public BoardDTO getSelect(int num) throws Exception;
		
		public List<BoardDTO> getList(PageMaker pageMaker) throws Exception;

}
