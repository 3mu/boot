package com.boot.web.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/3/12 0012.
 */

@Controller
public class UIController {

//    @Autowired
//    public IService service;
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String Index(Model model) {
        model.addAttribute("name", "123123");
        return "index";
    }
}
