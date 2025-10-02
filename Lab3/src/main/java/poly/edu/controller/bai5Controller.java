package poly.edu.controller;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import poly.edu.entity.UserZowick;

@Controller
public class bai5Controller {
	@RequestMapping("/bai5/form") 
	public String list(Model model) { 
		List<UserZowick> list = List.of( 
		UserZowick.builder().id("1quannhmts01396@fpt.edu.vn").fullname("4Nguyễn Hoàng Minh Quân").level(0).build(), 
		UserZowick.builder().id("2quannhmts01396@fpt.edu.vn").fullname("1ZOWICK").level(1).build(), 
		UserZowick.builder().id("3quannhmts01396@fpt.edu.vn").fullname("5Nguyễn Hoàng Minh Quân").level(2).build(), 
		UserZowick.builder().id("4quannhmts01396@fpt.edu.vn").fullname("2ZOWICK").level(2).build(), 
		UserZowick.builder().id("5quannhmts01396@fpt.edu.vn").fullname("6Nguyễn Hoàng Minh Quân").level(1).build(), 
		UserZowick.builder().id("6quannhmts01396@fpt.edu.vn").fullname("3ZOWICK").level(0).build()); 
		model.addAttribute("list", list); 
		return "bai5"; 	
	}
}