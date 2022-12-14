package com.studyforum.springboot.web.forum;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class ForumController {

    @GetMapping("/forum/discussionsPage")
    public String discussionsPage() {
        return "/forum/forum";
    }

}
