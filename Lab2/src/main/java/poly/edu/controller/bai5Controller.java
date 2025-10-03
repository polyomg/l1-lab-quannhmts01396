package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class bai5Controller {
    @RequestMapping("/bai5")
    public String m1(Model model) {
        return "bai5";
    }
    
    @RequestMapping("/A")
    public String m2(Model model) {
        model.addAttribute("message", "I come from bai5-formA");
        return "forward:/bai5";
    }
    
    @RequestMapping("/B")
    public String m3(RedirectAttributes params) {
        params.addAttribute("message", "I come from bai5-formB");
        return "redirect:/bai5"; 
    }
    
    @ResponseBody
    @RequestMapping("/C")
    public String m4() {
        return "I come from bai5-formC"; 
    }
}