package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class bai5Controller {
	@RequestMapping("/bai5/index")
	public String index(Model model) {
		return "bai5/home/index";
	}
	@RequestMapping("/bai5/about")
	public String about(Model model) {
		return "bai5/home/about";
	}
}
