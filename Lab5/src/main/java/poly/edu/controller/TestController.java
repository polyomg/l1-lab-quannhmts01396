package poly.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import poly.edu.service.SessionService;

@Controller
public class TestController {

    @Autowired
    SessionService sessionService;

    @ResponseBody
    @GetMapping("/test")
    public String showSessionInfo() {
        String user = sessionService.get("username");
        if (user == null) {
            return "Chưa đăng nhập!";
        } else {
            return "Đang đăng nhập với username: " + user;
        }
    }
}
