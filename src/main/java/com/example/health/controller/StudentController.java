package com.example.health.controller;

import com.alibaba.fastjson.JSON;
import com.example.health.common.CommonResult;
import com.example.health.service.StudentService;
import com.example.health.util.HttpClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // 定位
    @GetMapping("/getMap")
    public CommonResult getMap(@RequestParam("ip")String ip) {
        System.out.println(ip);
        String map = HttpClientUtil.doGet("http://api.map.baidu.com/location/ip?ak=TVclBEUd0APgn21Da5XrN4QglmU0webG&ip="+ip+"&coor=bd09ll");

        String address = (String)JSON.parseObject(map).get("address");

        System.out.println(address);
        return CommonResult.success(address);
    }
}
