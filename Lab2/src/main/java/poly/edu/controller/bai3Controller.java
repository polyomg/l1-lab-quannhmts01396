package poly.edu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import poly.edu.entity.Product;

@Controller
public class bai3Controller {

	@GetMapping("/bai3/form")
    public String form(Model model) {
        model.addAttribute("product", new Product());
        return "bai3";
    }

	@PostMapping("/bai3/save")
    public String save(@ModelAttribute Product product, Model model) {
		model.addAttribute("product", product);
        return "bai3";
    }
}
