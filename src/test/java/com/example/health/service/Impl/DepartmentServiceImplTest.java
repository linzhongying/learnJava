package com.example.health.service.Impl;

import com.example.health.common.CommonResult;
import com.example.health.entity.TbDepartment;
import com.example.health.service.DepartmentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DepartmentServiceImplTest {

    @Autowired
    private DepartmentService departmentService;

    @Test
    void deleteDepart() {
        CommonResult result = departmentService.getAll();
        List<TbDepartment> list = (List)result.getData();
        for (TbDepartment tbDepartment:list ) {
            System.out.println(tbDepartment.getDepartId()+"==>"+tbDepartment.getDepartName());
        }
    }

    @Test
    void updateDepart() {
    }

    @Test
    void getDepart() {
    }

    @Test
    void testAddDepart() {
    }

    @Test
    void testDeleteDepart() {
    }

    @Test
    void testUpdateDepart() {
    }

    @Test
    void testGetDepart() {
    }

    @Test
    void getDepartByName() {
    }
}