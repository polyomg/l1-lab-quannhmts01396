package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {
	@RequestMapping("/poly/hello")
	public String sayHello (Model model) {
		model.addAttribute("title","FPT Polytechnic");
		model.addAttribute("subject","Hello  World");
		return "/hello.html";	
	}
}



	

