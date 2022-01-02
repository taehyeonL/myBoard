package th.pro.first.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import th.pro.first.vo.BoardVO;

@Repository("BoardDAO")
public class BoardDao {
	@Autowired
	private SqlSession sqlSession;
	public int insertBoard(BoardVO vo) {
		int result = 0;
		result = sqlSession.insert("mapper.board.insertBoard", vo);
		System.out.println(result);
		return result;
	}
	
}
