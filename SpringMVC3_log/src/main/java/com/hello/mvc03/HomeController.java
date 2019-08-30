package com.hello.mvc03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hello.mvc03.dto.CustomerDto;
import com.hello.mvc03.model.biz.CustomerBiz;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private CustomerBiz biz;
	
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	public String selectList(Model model) {
		
		model.addAttribute("list", biz.selectList());
		
		return "boardlist";
	}
	
	@RequestMapping(value = "/detail.do")
	public String selectOne(Model model, String id) {
		
		model.addAttribute("dto", biz.selectOne(id));
		
		return "detail";
	}
	
	@RequestMapping(value = "/insert.do")
	public String insertForm() {
		
		return "insert";
	}
	
	@RequestMapping(value = "/insertres.do", method = RequestMethod.POST)
	public String insertRes(Model model, CustomerDto dto) {
		
		int res = biz.insert(dto);
		
		if(res > 0) {
			model.addAttribute("list", biz.selectList());
			return "boardlist";
		}else {
			return "insert";
		}
		
	}
	
	@RequestMapping(value = "/update.do", method = RequestMethod.POST)
	public String updateForm(Model model, String id) {
		
		model.addAttribute("dto", biz.selectOne(id));
		
		return "update";
	}
	
	@RequestMapping(value = "/updateres.do", method = RequestMethod.POST)
	public String updateRes(Model model, CustomerDto dto) {
		
		int res = biz.update(dto);
		
		if(res > 0) {
			model.addAttribute("list", biz.selectList());
			return "boardlist";
		}else {
			model.addAttribute("dto", biz.selectOne(dto.getId()));
			return "update";
		}
	}
	
	@RequestMapping(value = "delete.do")
	public String deleteOne(Model model, String id) {
		
		int res = biz.delete(id);
		
		if(res > 0) {
			model.addAttribute("list", biz.selectList());
			return "boardlist";
		}else {
			model.addAttribute("dto", biz.selectOne(id));
			return "detail";
		}
	}
	
}
