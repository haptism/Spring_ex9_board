package com.iu.board.qna;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.iu.board.BoardDAO;
import com.iu.board.BoardDTO;
import com.iu.util.PageMaker;
@Repository
public class QnaDAO implements BoardDAO {
	
	@Inject
	private SqlSession sqlSession;
	private static final String NAMESAPCE="QnaMapper.";
	
	//답글 사전작업
	public int setReplyUpdate(QnaDTO qnaDTO)throws Exception{
		return sqlSession.update(NAMESAPCE+"setReplyUpdate", qnaDTO);
	}
	//답글
	public int setReply(QnaDTO qnaDTO)throws Exception{
		return sqlSession.insert(NAMESAPCE+"setReply", qnaDTO);
	}

	@Override
	public int getTotalCount(PageMaker pageMaker) throws Exception {
		return sqlSession.selectOne(NAMESAPCE+"getCount", pageMaker);
	}

	@Override
	public int setWrite(BoardDTO boardDTO) throws Exception {
		
		return sqlSession.insert(NAMESAPCE+"setWrite", boardDTO);
	}

	@Override
	public int setDelete(int num) throws Exception {
		return sqlSession.delete(NAMESAPCE+"setDelete", num);
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		return sqlSession.update(NAMESAPCE+"setUpdate", boardDTO);
	}

	@Override
	public BoardDTO getSelect(int num) throws Exception {
		return sqlSession.selectOne(NAMESAPCE+"getSelect", num);
	}

	@Override
	public List<BoardDTO> getList(PageMaker pageMaker) throws Exception {
		return sqlSession.selectList(NAMESAPCE+"getList", pageMaker);
	}

}
