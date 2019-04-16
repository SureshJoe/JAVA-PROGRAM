package com.niitproject.front;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller 
{
	@RequestMapping(value="/")
	public String index()
	{
		return "index";
	}
@RequestMapping(value="/Login")
public String loginPage(Model M)
{
	M.addAttribute("suresh", "Login");
	return "Login";
}
}