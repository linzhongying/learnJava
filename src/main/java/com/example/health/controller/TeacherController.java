package com.example.health.controller;

import com.example.health.common.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @GetMapping("/test")
    public CommonResult test(){
        return CommonResult.success("success!!!!");
    }
}
