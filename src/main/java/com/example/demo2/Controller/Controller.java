package com.example.demo2.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @RequestMapping("/hello")
        public String hellowrold(){
        return "hellowrold Spring boot！";
    }
}
