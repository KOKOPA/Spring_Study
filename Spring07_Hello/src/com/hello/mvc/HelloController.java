package com.hello.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hello.mvc.model.HelloBiz;

@Controller
public class HelloController {

	@Autowired
	private HelloBiz biz;
	
	// TODO : 004. controller
	@RequestMapping("/hello.ho")
	public String getHello(Model model) {
		
		// TODO : 009. return 받은 값을 model 객체에 담기. ( ModelAndView )
		model.addAttribute("message", biz.getHello());
		
		return "/WEB-INF/views/hello.jsp";
	}
}
