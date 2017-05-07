package com.winner.Komunalka.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	
	@RequestMapping("/hello")
	public String hello(String msg){
		return "hello-world";
	}

}
