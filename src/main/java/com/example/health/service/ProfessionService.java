package com.example.community.service;


import com.example.community.common.CommonResult;
import com.example.community.entity.TbProfession;

public interface ProfessionService extends BaseService<TbProfession> {
    // 根据名字搜索
    public CommonResult getProfByName(String profName);
}
