package com.zhao.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// @Controller
public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //ModelAndView 模型和视图
        ModelAndView mv = new ModelAndView();

        //封装对象，放在 ModelAndView 中
        mv.addObject("msg","Hello SpringMVC!");
        //封装要跳转的视图，放在ModelAndView中
        mv.setViewName("hello");   // WEB-INF/jsp/hello.jsp
        return mv;
    }


    //真实访问地址 : 项目名/hello
    /*
    @RequestMapping("/hello")
    public String sayHello(Model model){
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg", "hello,SpringMVC");
        //web-inf/jsp/hello.jsp
        return "hello";
    }
    */
}