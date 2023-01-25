package com.example.firstdemowebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHello {

	@RequestMapping("hello-world")
	@ResponseBody
	public String SayHelloWorld() {
		return "Hello World";
	}
	
	@RequestMapping("say-hello")
	public String SayHelloDemo() {
		return "sayhello";
	}
}
