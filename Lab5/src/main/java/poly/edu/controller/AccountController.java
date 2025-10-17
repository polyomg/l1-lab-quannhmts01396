package poly.edu.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import poly.edu.service.CookieService;
import poly.edu.service.ParamService;
import poly.edu.service.SessionService;

@Controller
public class AccountController {

    @Autowired
    CookieService cookieService;

    @Autowired
    ParamService paramService;

    @Autowired
    SessionService sessionService;

    @GetMapping("/bai2/login")
    public String login1(Model model) {
    	model.addAttribute("message", "Vui lòng nhập tài khoản!");
        return "account/login";
    }

    @PostMapping("/bai2/login")
    public String login2(Model model) {
    	
        String username = paramService.getString("username", "");
        String password = paramService.getString("password", "");
        boolean remember = paramService.getBoolean("remember", false);

        if (username.equals("ZOWICK") && password.equals("123")) {
            sessionService.set("username", username);

            if (remember) {
                cookieService.add("user", username, 24 * 10);
            } else {
                cookieService.remove("user");
            }
            
            model.addAttribute("message", "Đăng nhập thành công!");
        } else {
            model.addAttribute("message", "Sai tên đăng nhập hoặc mật khẩu!");
        }
        return "account/login";
    }

    @GetMapping("/bai3/register")
    public String register1() {
        return "account/register";
    }

    @PostMapping("/bai3/register")
    public String register2(Model model, MultipartFile photo) {
        String username = paramService.getString("username", "");
        String password = paramService.getString("password", "");
        String email = paramService.getString("email", "");

        if (username.isEmpty() || password.isEmpty() || email.isEmpty()) {
            model.addAttribute("message", "Vui lòng nhập đầy đủ thông tin!");
            return "account/register";
        }

        File savedFile = paramService.save(photo, "/uploads/");
        if (savedFile != null) {
            model.addAttribute("photo", savedFile.getName());
        }
        sessionService.set("username", username);

        model.addAttribute("message", "Đăng ký thành công!");
        return "account/register";
    }
    @PostMapping("/logout")
    @ResponseBody
    public String logout() {
        sessionService.remove("username");
        return "Đã đăng xuất!";
    }
}
