package com.amosli;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {

	@ResponseBody
	@RequestMapping("hi")
	public String sayHi() {
		return "hi,amosli";
	}
}
