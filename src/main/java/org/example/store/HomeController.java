package org.example.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    //use of variable
    @Value("${spring.application.name}")
    private String appNAme;
    @RequestMapping("/")
    public String index(){
        System.out.println("AppName: " + appNAme);
        return "index.html";
    }
}
