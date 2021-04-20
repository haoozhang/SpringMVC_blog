package com.zhao.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.zhao.pojo.User;
import com.zhao.utils.JsonUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping("json1")
    @ResponseBody // 方法直接返回字符串，不被解析为视图
    public String json1() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        User user = new User("张昊", 18, "male");
        String str = mapper.writeValueAsString(user);
        return str;
    }

    @RequestMapping("json2")
    @ResponseBody
    public String json2() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        User user1 = new User("张昊一", 18, "male");
        User user2 = new User("张昊二", 19, "male");
        User user3 = new User("张昊三", 20, "male");
        User user4 = new User("张昊四", 21, "male");
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        String str = mapper.writeValueAsString(userList);
        return str;
    }

    @RequestMapping("json3")
    @ResponseBody
    public String json3() throws JsonProcessingException {
        String date = JsonUtil.getDate(new Date());
        return date;
    }

}
