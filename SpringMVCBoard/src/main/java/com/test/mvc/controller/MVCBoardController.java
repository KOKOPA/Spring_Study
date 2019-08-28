package com.test.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.mvc.biz.MVCBoardBizImpl;
import com.test.mvc.dto.MVCBoardDto;


@Controller
public class MVCBoardController {

	@Autowired
	private MVCBoardBizImpl biz;
	
	@RequestMapping(value = "/boardlist.do")
	public String selectList(Model model) {
		
		model.addAttribute("list", biz.selectList());
		
		return "boardlist";
	}
	
	@RequestMapping(value = "/selectone.do")
	public String selectOne(Model model, int seq) {
		
		model.addAttribute("dto", biz.selectone(seq));
		
		return "selectone";
	}
	
	@RequestMapping(value = "/insertform.do", method = {RequestMethod.GET, RequestMethod.POST})
	public String insertForm() {
		
		
		
		return "insertform";
	}
	
	@RequestMapping(value = "/insertres.do", method = RequestMethod.POST)
	public String insertRes(@ModelAttribute MVCBoardDto dto, Model model) {
		
		int res = biz.insert(dto);
		
		if(res > 0) {
			model.addAttribute("list", biz.selectList());
			return "boardlist";
		}else {
			model.addAttribute("dto", biz.selectone(dto.getSeq()));
			return "insertform";
		}
	}
	
	@RequestMapping(value = "/updateform.do")
	public String updateForm(Model model, int seq) {
		
		model.addAttribute("dto", biz.selectone(seq));
		
		return "updateform";
	}
	
	@RequestMapping(value = "/updateres.do", method = RequestMethod.POST)
	public String updateRes(Model model, MVCBoardDto dto) {
		
		int res = biz.update(dto);
		model.addAttribute("dto", biz.selectone(dto.getSeq()));
		
		if(res > 0) {
			return "selectone";
		}else {
			return "updateform";
		}
	}
	
	@RequestMapping(value = "/deleteone.do")
	public String deleteOne(Model model, int seq) {
		
		int res = biz.delete(seq);

		if(res > 0) {
			model.addAttribute("list", biz.selectList());
			return "boardlist";
		}else {
			model.addAttribute("dto", biz.selectone(seq));
			return "selectone";
		}
		
	}
	
}


