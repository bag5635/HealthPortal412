package com.example.healthportal412;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {

    @RequestMapping(value ="/", method = RequestMethod.GET)
    public String login(){
        return "Login";
    }

    @RequestMapping(value ="/", method = RequestMethod.POST)
    public String HomePage(@RequestParam String userId, @RequestParam String password){
        if(userId.equals("AdamJ@gmail.com")&& password.equals("Coff33")){
            return "Home";
        }
        return "TryAgain";
    }
    @RequestMapping(value ="/TryAgain", method = RequestMethod.POST)
    public String failed(@RequestParam String userId, @RequestParam String password){
        if(userId.equals("AdamJ@gmail.com")&& password.equals("Coff33")){
            return "Home";
        }
        return "TryAgain";
    }




}
