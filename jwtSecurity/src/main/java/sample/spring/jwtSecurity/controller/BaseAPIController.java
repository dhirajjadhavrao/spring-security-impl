package sample.spring.jwtSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseAPIController {

    @GetMapping({"/"})
    public String logIn(){
        return "Hello World !";
    }
}
