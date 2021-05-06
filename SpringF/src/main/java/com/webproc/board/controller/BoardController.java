package com.webproc.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// Controller = url 로 매핑
@RequestMapping("/board")
// "/board" url 이면 이 컨트롤러 실행됨.
public class BoardController {
	
	@GetMapping(value="/list")
	public String list() {
		
		System.out.println("BoardController.list");
		//-->ViewResolver가 가져가서 /WEB-INF/views/ = + .jsp 됨.
		return "board/list";
		
	}
}
