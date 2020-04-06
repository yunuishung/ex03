package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.domain.PageDTO;
import org.zerock.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;


@Controller
@Log4j
@RequestMapping("/board/*")
@AllArgsConstructor
public class BoardController {

	private BoardService service;
	
	@GetMapping("/list")
	public void list(Criteria cri,  Model model) {
		log.info("***리스트 처리*****");
		model.addAttribute("list",service.getList( cri ) );
		int count = (int)service.scount();  
		model.addAttribute("pageMaker", new PageDTO(cri,count));
	}
	
	@PostMapping("/register")
	public String register(BoardVO board) {
		log.info("****글등록처리:*****" + board);
		service.register(board);
		return "redirect:/board/list";
		
	}
	@GetMapping("/register")
	public void register() {

	}	
	
	@GetMapping("/get")
	public void get(@RequestParam("bno") long bno, Model model) {
		log.info("**************************글 조회 요청********************");
		model.addAttribute("board", service.get(bno));

	}
	
	@PostMapping("/modify")
	public String modify(BoardVO board, RedirectAttributes rttr) {
		log.info("=========================글 수정 =========="+ board );
		if( service.modify(board)) {
			rttr.addFlashAttribute("결과", "글 수정 성공");
		}
		return "redirect:/board/list";
	}

	@PostMapping("/remove")
	public String remove(@RequestParam("bno") Long bno, RedirectAttributes rttr) {
		log.info( "==========================삭제 ===============" + bno );
		if( service.remove(bno)) {
			rttr.addFlashAttribute("result","글 삭제 성공");
		}
		return "redirect:/board/list";
	}
	

	
}














