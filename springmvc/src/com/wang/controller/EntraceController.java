package com.wang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class EntraceController {
    @RequestMapping("/hello")
    public String entrance(){
        org.apache.log4j.Logger log =org.apache.log4j.Logger.getLogger(EntraceController.class);
        log.info("hello");
        return "province";
    }

//    @RequestMapping("/success")
//    public String userSubmit(@ModelAttribute("user") UserModel user){
//        org.apache.log4j.Logger log =org.apache.log4j.Logger.getLogger(EntraceController.class);
//        log.info("begin to submit");
//        System.out.println("name"+map.get("username"));
//        return  "success";
//    }

}
