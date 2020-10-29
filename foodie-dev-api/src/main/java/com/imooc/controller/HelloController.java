package com.imooc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@ApiIgnore   //再swagger中忽略
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hellow(){
        return "hellow world";
    }

    @GetMapping("/setSession")
    public String session(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.setAttribute("user","new user");
        return "ok";
    }
    @GetMapping("/getSession")
    public String getSession(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.setAttribute("user","new user");
        String id = session.getId();
        System.out.println(id);
        Cookie[] cookies = request.getCookies();
        for (Cookie c:cookies){
            String value = c.getValue();
            System.out.println(value);
        }
        return "hellow world";
    }
}
