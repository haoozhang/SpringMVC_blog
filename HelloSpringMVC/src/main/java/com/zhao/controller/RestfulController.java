package com.zhao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestfulController {

    @RequestMapping(value = "/add/{p1}/{p2}", method = RequestMethod.GET)
    // 等价于 @GetMapping("/add/{p1}/{p2}")
    public String addTwoNum(@PathVariable int p1, @PathVariable int p2, Model model) {
        int result = p1 + p2;
        model.addAttribute("msg", "result: " + result);
        return "hello";
    }
}
