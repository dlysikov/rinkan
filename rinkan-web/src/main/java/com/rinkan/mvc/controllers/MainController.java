package com.rinkan.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping(value = "/login")
    public String getLoginPage(){
        return "login";
    }

    @RequestMapping(value = "/user")
    public String getUserPage(){
        return "userPage";
    }


    @RequestMapping(value = "/admin")
    public String getAdminPage(){
        return "adminPage";
    }

    @RequestMapping(value = "/accessDenied")
    public String getAccessDeniedPage(){
        return "errors/access-denied";
    }

}
