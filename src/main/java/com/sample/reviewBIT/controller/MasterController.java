package com.sample.reviewBIT.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MasterController {
    //    http://localhost:8080/register?data=%7B%22name%22%3A%22ABC%22%2C%22id%22%3A%221%22%7D
    @RequestMapping("/register")
    @ResponseBody
    public String register(String data) {
        return data;
    }

    //    http://localhost:8080/login?data=%7B%22name%22%3A%22ABC%22%2C%22id%22%3A%221%22%7D
    @RequestMapping("/login")
    @ResponseBody
    public String login(String data) {
        return data;
    }
}
