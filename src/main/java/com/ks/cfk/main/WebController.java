package com.ks.cfk.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

	@RequestMapping(value = "/*")
	public String index() {
		System.out.println("inside webcontroller ");
		return "yummy/index";
	}

}
