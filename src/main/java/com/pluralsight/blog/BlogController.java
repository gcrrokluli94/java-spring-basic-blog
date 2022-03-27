package com.pluralsight.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @GetMapping("/")
    public String listPosts(ModelMap map) {
        map.put("title", "Blog Post 1");
        return "home";
    }
}
