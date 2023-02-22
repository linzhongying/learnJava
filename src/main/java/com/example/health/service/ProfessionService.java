package com.example.health.service;


import com.example.health.common.CommonResult;
import com.example.health.entity.TbProfession;

public interface ProfessionService extends BaseService<TbProfession> {
    // 根据名字搜索
    public CommonResult getProfByName(String profName);
}
