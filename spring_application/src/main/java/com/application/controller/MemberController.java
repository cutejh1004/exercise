package com.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.application.dto.MemberVO;
import com.application.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	@GetMapping("/list")
	public void list(Model model)throws Exception{
		List<MemberVO> memberList = service.list();
		model.addAttribute("memberList", memberList);
	}
}
