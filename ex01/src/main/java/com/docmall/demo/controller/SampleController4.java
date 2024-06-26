package com.docmall.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.docmall.demo.domain.ProductVO;

@Controller
public class SampleController4 {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController4.class);
	
	//메서드에 파라미터에 제공한 값을 JSP에서 사용하고 싶을 경우 @ModelAttribute("이름") 이용하기.
	// http://localhost:9090/doJ>name=홍길동&age=100
	@RequestMapping("/doJ")
	public String doJ(@ModelAttribute("name") String name, @ModelAttribute("age") int age) {
		logger.info("이름은? " + name);
		logger.info("나이는? " + age);
		
		return "testJ";
	}

	// product객체의 정보를 jsp파일에서 사용하고 싶을 경우
	@RequestMapping("/doK")
	public String doK(Model model) {
		
		// 실제(실무)는 db에서 상품테이블에 대한 정보를 생성해 옴.
		ProductVO product = new ProductVO("사과", 10000);
		
		logger.info("상품정보? " + product); // product.toString() 메서드 호출
		
		//model.addAttribute("jsp에서 참조할 이름", 객체);
		model.addAttribute("product", product);
		
		return "productInfo";
	}
}
