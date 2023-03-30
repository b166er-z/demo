package com.example.demo.controllers;

import com.example.demo.vo.Dog;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@AllArgsConstructor
@RequestMapping("/test")
public class TestController {
    private Dog dog;

    @RequestMapping("/say")
    @ResponseBody
    public String say(String name){
        return "Hello,"+name+",I am "+dog.getName()+",I am "+dog.getAge()+" old.I like "+dog.getHobby();
    }
}
