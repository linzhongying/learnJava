package com.example.health.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.health.entity.TbStudent;
import com.example.health.mapper.StudentMapper;
import com.example.health.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends BaseServiceImpl<TbStudent> implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    private QueryWrapper<TbStudent> queryWrapper = null;
    private TbStudent tbStudent = null;

}
