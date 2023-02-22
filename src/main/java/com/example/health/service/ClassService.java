package com.example.health.service;

import com.example.health.common.CommonResult;
import com.example.health.entity.TbClass;

public interface ClassService extends BaseService<TbClass>{
    public CommonResult getAllClass(int current, int size);
}
