package ma.fstg.security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user/dashboard")
    public String userDashboard() {
        return "user_dashboard"; // user_dashboard.html
    }
}
