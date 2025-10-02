package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import poly.edu.entity.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class btController {

    @GetMapping("/baitap/form")
    public String form(Model model) {
        Product p = new Product();
        p.setName("Macbook M3");
        p.setPrice(10000.0);

        model.addAttribute("product1", p); 
        model.addAttribute("items", items);
        return "baitap"; 
    }

    @PostMapping("/baitap/save")
    public String save(@ModelAttribute("product2") Product p, Model model) { 
        model.addAttribute("product1", new Product("Macbook M3", 10000.0)); 
        model.addAttribute("product2", p);
        items.add(p);
        model.addAttribute("items", items); 
        return "baitap";
    }     
    public List<Product> items = new ArrayList<>(
    		Arrays.asList(new Product("ZOWICK", 9999.0), 
    				new Product("Laptop Gigabyte GD G5", -800.0)
    		)
    );
        
}
