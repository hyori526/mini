package io.goorm.mini_01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping("/")
    public String index() {
        return "index";  // "index.html" 템플릿을 반환
    }
}