package com.example.health.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.health.common.CommonResult;
import com.example.health.mapper.DepartmentMapper;
import com.example.health.entity.TbDepartment;
import com.example.health.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DepartmentServiceImpl extends BaseServiceImpl<TbDepartment> implements DepartmentService  {

    @Autowired
    private DepartmentMapper departmentMapper;

    private TbDepartment tbDepartment = null;
    private List<TbDepartment> list = null;
    private QueryWrapper<TbDepartment> queryWrapper = null;
    @Override
    public CommonResult getDepartByName(String departName) {
        queryWrapper = new QueryWrapper<TbDepartment>();
        queryWrapper.like("depart_name",departName);
        list = departmentMapper.selectList(queryWrapper);
        if(list==null)return CommonResult.failed("获取失败");
        return CommonResult.success(list,"获取成功");
    }
}
