package com.example.community.service.Impl;

import com.example.community.common.CommonResult;
import com.example.community.entity.TbClass;
import com.example.community.mapper.ClassMapper;
import com.example.community.service.ClassService;
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