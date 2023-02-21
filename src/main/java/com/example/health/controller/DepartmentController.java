package com.example.community.controller;

import com.example.community.common.CommonResult;
import com.example.community.entity.TbDepartment;
import com.example.community.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    private Map<String,String> map = null;

    // 分页查询
    @GetMapping("/getDepartment")
    public CommonResult getDepartment(@RequestParam("pageIndex")int pageIndex,
                                      @RequestParam("pageSize")int pageSize,
                                      @RequestParam("query")String query) {
        map = null;
        if(!"".equals(query.trim())){
            map = new ConcurrentHashMap<String,String>();
            map.put("Depart_name",query);
        }
        return departmentService.getByPage(pageIndex,pageSize,map);
    }
    // 获取所有
    @GetMapping("/getAllDepartment")
    public CommonResult getAllDepartment() {
        return departmentService.getAll();
    }

    @DeleteMapping("/delDepartment")
    public CommonResult delDepartment(@RequestParam("id")int id) {
        return departmentService.delete(id);
    }

    // 更新
    @PutMapping("/putDepartment")
    public CommonResult putDepartment(@RequestBody TbDepartment department){
        departmentService.getAll();
        return departmentService.update(department);
    }
    // 更新
    @PostMapping("/addDepartment")
    public CommonResult addDepartment(@RequestBody TbDepartment department){

        return departmentService.add(department);
    }

}
