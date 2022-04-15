package com.f672jh2.demo.Ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/app2")
public class App2 {
    
    @RequestMapping("/app")
    public String m(){
        return "----";
    }
}
