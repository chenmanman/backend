package controller;


import javax.servlet.http.HttpSession;

import model.Member;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import org.springframework.web.bind.annotation.ResponseBody;

import service.MemberService;


@Controller
public class MemberController {

	@Resource
	private MemberService memberService;
	
	@RequestMapping(value="/GetMemberName")
	@ResponseBody()
	public String  findMemberName(String uid,HttpSession session){	
	
		String name="";
		
		try {
			
			name=	memberService.GetMemberName("wssw3261vo1449d708r57242481a92r5v");
			System.out.println(name);
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		return name;

	}
	
	
	@RequestMapping("/mem")
	public String  index(String uid,HttpSession session){	
		return "index";
	}
	
	

	
	
	
	
	
	
	
	
	
}
