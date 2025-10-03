package poly.edu.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class AuthController {

    @Autowired
    HttpServletRequest request;

    @RequestMapping("/form")
    public String form() {
        return "/login.html";
    }

    @PostMapping("/check")
    public String login(Model model) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("ZOWICK".equals(username) && "113".equals(password)) {
            model.addAttribute("message", "Đăng nhập True!");
        } else {
            model.addAttribute("message", "Đăng nhập Fail!");
        }

        return "/login.html";
    }
}
