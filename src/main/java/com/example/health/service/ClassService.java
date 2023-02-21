package com.example.community.service;

import com.example.community.common.CommonResult;
import com.example.community.entity.TbClass;

public interface ClassService extends BaseService<TbClass>{
    public CommonResult getAllClass(int current, int size);
}
