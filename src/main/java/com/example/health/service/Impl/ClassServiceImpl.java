package com.example.health.service.Impl;

import com.example.health.common.CommonResult;
import com.example.health.entity.TbClass;
import com.example.health.mapper.ClassMapper;
import com.example.health.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl extends BaseServiceImpl<TbClass> implements ClassService {
    @Autowired
    private ClassMapper classMapper;
    private List<Object> list = null;
    @Override
    public CommonResult getAllClass(int current, int size){
          list = classMapper.getAllClass(current, size);
          if(list==null)return CommonResult.failed("获取失败");
          return CommonResult.success(list,"获取成功");
    }
}