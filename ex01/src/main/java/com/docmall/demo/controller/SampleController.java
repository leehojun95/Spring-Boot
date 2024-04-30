package com.docmall.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller	//클라이언트(브라우저)로 부터 요청을 받아 실행하는 스프링 클래스 @Controller 어노테이션을 클래스 수준으로 적용해야 한다.
public class SampleController { //***Controller하는게 좋다(관례상)
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	//클라이언트(브라우저)에서 메서드를 호출하고자 할 경우에는 매핑주소를 설정해야 한다. 이때 매핑주소 설정하는 어노테이션이 @RequestMapping("매핑주소")이다.
	@RequestMapping("/doA")	//	/WEB-INF/views/ + "매핑주소" + .jsp -> / WEB-INF/views/doA.jsp
	public void doA() {
		logger.info("doA called...");
	}
	
	// 매핑주소 /doB 와 매서드명 doB() 이름은 상관이 없다.(일치할 필요가 없다.)
	@RequestMapping("/doB")		// @RequestMapping("/doB") jsp파일이된다.
	public void doB() {
		logger.info("doB called...");
		
		//System.out.println("doB called..."); 성능상의 이유로 사용하지 않는다.
		
	}
	
	@RequestMapping("/doC")
	public void doC() {
		logger.info("doC called...");
	}
	
	
}
