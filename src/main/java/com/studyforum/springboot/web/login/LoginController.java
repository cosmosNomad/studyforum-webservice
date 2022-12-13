package com.studyforum.springboot.web.login;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class LoginController {

    @GetMapping("/login/signInPage")
    public String signInPage() {
        return "/login/sign-in";
    }

    @GetMapping("/login/registerPage")
    public String registerPage() {
        return "/login/register";
    }
}
