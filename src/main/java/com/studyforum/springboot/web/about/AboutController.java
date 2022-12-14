package com.studyforum.springboot.web.about;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class AboutController {

    @GetMapping("/about/aboutPage")
    public String aboutPage() {
        return "/about/about";
    }

}
