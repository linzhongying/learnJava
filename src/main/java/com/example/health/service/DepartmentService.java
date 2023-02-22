package com.example.health.service;

import com.example.health.common.CommonResult;
import com.example.health.entity.TbDepartment;

public interface DepartmentService extends BaseService<TbDepartment>{

    // 根据名字搜索
    public CommonResult getDepartByName(String departName);
}
