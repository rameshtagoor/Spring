package com.telusko;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeContrlloer {
	@RequestMapping("/addAlien")
	public String add(){
		System.out.println("Welcome here");
		return"addAlien";
	}

}
