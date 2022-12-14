package com.studyforum.springboot.web.posts;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class PostsController {

    @GetMapping("/posts/postPage")
    public String postPage() {
        return "/posts/post";
    }

}
