package com.example.health.controller;

import com.example.health.common.CommonResult;
import com.example.health.entity.TbDoctor;
import com.example.health.entity.TbManager;
import com.example.health.entity.TbStudent;
import com.example.health.entity.TbTeacher;
import com.example.health.service.DoctorService;
import com.example.health.service.ManagerService;
import com.example.health.service.StudentService;
import com.example.health.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
public class LoginController {
    @Autowired
    private ManagerService managerService;
    @Autowired
    private StudentService studentService;
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private DoctorService doctorService;

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return "Hello Nacos Discovery " + string;
    }

    @PostMapping("/login")
    public CommonResult userLogin(@RequestParam("userName")String userName, @RequestParam("passWord")String passWord,
                                     @RequestParam("character")int character, HttpSession session){
        Map<String,String> map = new ConcurrentHashMap<String,String>();

        if("".equals(userName.trim())||"".equals(passWord.trim()))return CommonResult.failed("用户名或密码不能为空!");

        map.put("Login_pwd",passWord);
        switch (character){// 管理员
            case 0:
                map.put("account_num",userName);
                TbManager manager = managerService.login(map);
                if(manager==null)return CommonResult.failed("用户名或密码错误!");
                session.setAttribute("security",manager);
                return CommonResult.success(manager,"登录成功!");
            case 1:// 学生
                map.put("Stu_id",userName);
                TbStudent tbStudent = studentService.login(map);
                if(tbStudent==null)return CommonResult.failed("用户名或密码错误!");
                session.setAttribute("security",tbStudent);
                return CommonResult.success(tbStudent,"登录成功!");
            case 2: // 教师
                map.put("Teacher_id",userName);
                TbTeacher teacher = teacherService.login(map);
                if(teacher==null)return CommonResult.failed("用户名或密码错误!");
                session.setAttribute("security",teacher);
                return CommonResult.success(teacher,"登录成功!");
            case 3:// 医生
                map.put("Doctor_id",userName);
                TbDoctor doctor = doctorService.login(map);
                if(doctor==null)return CommonResult.failed("用户名或密码错误!");
                session.setAttribute("security",doctor);
                return CommonResult.success(doctor,"登录成功!");
            default:
                return CommonResult.failed("登录异常");
        }
    }
}
