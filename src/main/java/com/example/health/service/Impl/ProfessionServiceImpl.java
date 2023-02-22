package com.example.health.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.health.common.CommonResult;
import com.example.health.mapper.ProfessionMapper;
import com.example.health.entity.TbProfession;
import com.example.health.service.ProfessionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProfessionServiceImpl extends BaseServiceImpl<TbProfession> implements ProfessionService {
    @Autowired
    private ProfessionMapper professionMapper;

    private TbProfession tbProfession = null;
    private List<TbProfession> list = null;
    private QueryWrapper<TbProfession> queryWrapper = null;

    @Override
    public CommonResult getProfByName(String profName) {
        queryWrapper = new QueryWrapper<TbProfession>();
        queryWrapper.like("depart_name",profName);
        list = professionMapper.selectList(queryWrapper);
        if(list==null)return CommonResult.failed("获取失败");
        return CommonResult.success(list,"获取成功");
    }
}
