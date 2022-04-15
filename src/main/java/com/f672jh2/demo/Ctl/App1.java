package com.f672jh2.demo.Ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/app")
public class App1 {

    @RequestMapping("/app")
    public String m(){
        return "----";
    }
}
