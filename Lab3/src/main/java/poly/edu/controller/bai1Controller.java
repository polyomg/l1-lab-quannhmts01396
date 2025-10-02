package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import poly.edu.entity.UserZowick;

@Controller
public class bai1Controller {
	
	@RequestMapping("/bai1/form") 
	public String detail(Model model) { 
		UserZowick staff = UserZowick.builder() 
			.id("quannhmts01396@fpt.edu.vn") 
			.fullname("Nguyễn Hoàng Minh Quân") 
			.level(0) 
			.build(); 
		model.addAttribute("UserZowick", staff); 
		return "bai1"; 
	} 
}
