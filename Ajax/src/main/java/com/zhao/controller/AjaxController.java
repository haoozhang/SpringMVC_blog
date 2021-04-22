package com.zhao.controller;

import com.zhao.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AjaxController {

    @RequestMapping("/t1")
    public String test() {
        return "test";
    }

    @RequestMapping("/a1")
    public void ajax1(String name, HttpServletResponse response) throws IOException {
        if ("admin".equals(name)){
            response.getWriter().print("true");
        }else{
            response.getWriter().print("false");
        }
    }

    @ResponseBody
    @RequestMapping("/a2")
    public List<User> ajax1() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("zhao8", 18, "男"));
        userList.add(new User("zhao9", 19, "male"));
        userList.add(new User("zhao1", 21, "male"));
        return userList;
    }

    @ResponseBody
    @RequestMapping("/a3")
    public String a3(String name, String pwd) {
        String msg=  "";
        if (name != null) {
            // admin 应该从数据库中获取
            if ("admin".equals(name)) {
                msg = "ok";
            } else {
                msg = "用户名有误";
            }
        }
        if (pwd != null) {
            // pwd 应该从数据库中获取
            if ("123456".equals(pwd)) {
                msg = "ok";
            } else {
                msg = "密码有误";
            }
        }
        return msg;
    }

}
