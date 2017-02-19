package com.boot.webcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/2/19 0019.
 */
@Controller
public class HomeController {
    @RequestMapping("/index")
    public String index(ModelMap map) {
        map.addAttribute("name", "this is my app");
        return "index";
    }
}
