package com.example.health.service.Impl;

import com.example.health.common.CommonResult;

import com.example.health.entity.TbDepartment;
import com.example.health.service.DepartmentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class BaseServiceImplTest {
    @Autowired
    private DepartmentService departmentService;
    @Test
    void add() {
        CommonResult result = departmentService.add(new TbDepartment((short)10,"测试学院"));
        System.out.println("#########################################");
        System.out.println(result);
        System.out.println("#########################################");
        //for ( TbProfession profession :list ) {
          //  System.out.println(profession.toString());
        //}
    }

    @Test
    void delete() {
    }

    @Test
    void update() {
    }

    @Test
    void findById() {
    }

    @Test
    void getAll() {

    }

    @Test
    void getByPage() {
    }
}