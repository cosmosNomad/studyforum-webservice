package com.studyforum.springboot.web.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login/sign-in")
    public String signIn() {
        return "/login/sign-in";
    }
}
