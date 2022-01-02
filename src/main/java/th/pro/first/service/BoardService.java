package th.pro.first.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import th.pro.first.dao.BoardDao;
import th.pro.first.vo.BoardVO;

@Service("boardService")
public class BoardService {
	@Autowired
	private BoardDao dao;
	
	public boolean writeBoard(BoardVO vo) {
		boolean flag=false;
		int result=0;
		result=dao.insertBoard(vo);
		if(result>0) {
			flag=true;
			System.out.println("서비스에서 입력완료");
		}
		return flag;
	}
	
	
	
}
