package poly.edu.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/DTvCV")
public class TinhDTvCVController {
    @Autowired
    HttpServletRequest request;

    @RequestMapping("/form")
    public String form() {
        return "/ChuNhat.html";
    }
    @PostMapping("/tinh")
    public String tinh(Model model) {
    	double dai = Double.parseDouble(request.getParameter("dai"));
    	double rong = Double.parseDouble(request.getParameter("rong"));
    	double DT = dai * rong;
        double CV = 2 * (dai + rong);

        model.addAttribute("dai", dai);
   	    model.addAttribute("rong", rong);
   	    model.addAttribute("CV", CV);
   	    model.addAttribute("DT", DT);
   	    return "/ChuNhat.html";
    }
}

