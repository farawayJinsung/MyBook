package edu.osu.cse5234.controller;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class Home {

	public Home() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String viewHome(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		return "home";
	}
}
