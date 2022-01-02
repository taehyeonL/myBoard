package th.pro.first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import th.pro.first.service.BoardService;
import th.pro.first.vo.BoardVO;

@Controller("boardController")

public class BoardController {
	
	@Autowired
	private BoardService service;
	@Autowired
	private BoardVO boardVO;

	
	@ResponseBody
	@RequestMapping(value = "/board", method = RequestMethod.GET/* , produces = "application/json; charset=utf8" */)
	public void writeBoard(/* @RequestBody BoardVO boardVO */){
		boolean flag=false;;
		boardVO.setBoardTitle("hi");
		boardVO.setBoardBody("body");
		boardVO.setId("lth3723");
		boardVO.setBoardCategory("free");
		
		flag = service.writeBoard(boardVO);
		if(flag==true) {
			System.out.println("컨트롤러 삽입성공");
		}
		System.out.println("게시판 카테고리"+boardVO.getBoardCategory());
		
		}

}
