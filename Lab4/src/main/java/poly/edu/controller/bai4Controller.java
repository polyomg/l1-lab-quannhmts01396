package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class bai4Controller {
	@RequestMapping("/bai4/index")
	public String index(Model model) {
		return "bai4/home/index";
	}
	@RequestMapping("/bai4/about")
	public String about(Model model) {
		return "bai4/home/about";
	}
}
