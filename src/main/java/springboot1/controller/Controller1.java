package springboot1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test2")
public class Controller1 {

    @GetMapping("dk")
    public String test(){
        System.out.println("in DK....");
        return "dk";
    }

    @GetMapping("dk2")
    public String test2(){
        return "dk2";
    }
}
