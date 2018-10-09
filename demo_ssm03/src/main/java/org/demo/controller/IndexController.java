package org.demo.controller;

import org.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	@Autowired
	HelloService hs;
	
	@ResponseBody
	@RequestMapping("/showObject")
	public Object getObject() {
		
		return hs.getTableTest01(2).getName();
	}
	
}
