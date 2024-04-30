package com.docmall.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.docmall.demo.dto.LoginDTO;

@RequestMapping("/sample/*")	//아래 매핑주소의 공통주소이면서, jsp파일의 폴더명이 된다.
@Controller
public class SampleController {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	// 클라이언트(브라우저) 요청이 get방식일 경우.   주소? localhost:9090/sample/doA
	@GetMapping("doA")
	public void doA() {
		logger.info("called doA...");
	}
	
	// 주소? localhost:9090/sample/doB
	@GetMapping("doB")
	public void doB() {
		logger.info("called doB...");
	}
	
	// 주소? localhost:9090/sample/doC
	@GetMapping("doC")
	public void doC() {
		logger.info("called doC...");
	}
	
	//doD()메서드를 여러개의 매핑주소가 공유하고 잫ㄹ때 다음같이 처맇나다.
	// 주소? localhost:9090/sample/doD
	// 주소? localhost:9090/sample/testD
	@GetMapping(value = {"doD", "testD"})
	public void doD() {
		logger.info("called doD...");
	}
	
	/***********************************************************************/
	
	//주소? get요청 localhost:9090/sample/basicGet
	@GetMapping("basicGet")
	public void basicGet() {
		logger.info("called basicGet...");
	}
	/*
	//주소? post요청 localhost:9090/sample/basicPost
	@PostMapping("basicPost")
	public void basicPost(String u_id, String u_pw) {
		logger.info("called basicPost...");
		logger.info("아이디는? " + u_id);
		logger.info("비밀번호는? " + u_pw);
	}
	*/
	
	@PostMapping("basicPost")
	public void basicPost(LoginDTO dto) {
		logger.info("called basicPost...");
		logger.info("아이디는? " + dto.getU_id());
		logger.info("비밀번호는? " + dto.getU_pw());
	}
	
	
	
	
}
