package com.webproc.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// Controller = url �� ����
@RequestMapping("/board")
// "/board" url �̸� �� ��Ʈ�ѷ� �����.
public class BoardController {
	
	@GetMapping(value="/list")
	public String list() {
		
		System.out.println("BoardController.list");
		//-->ViewResolver�� �������� /WEB-INF/views/ = + .jsp ��.
		return "board/list";
		
	}
}
