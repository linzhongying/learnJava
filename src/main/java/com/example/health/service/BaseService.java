package com.example.community.service;


import com.example.community.common.CommonResult;

import java.io.Serializable;
import java.util.Map;

public interface BaseService<T> {
    // 登录
    public T login(Map<String,String> map);
    // 添加
    public CommonResult<T> add(T t);

    // 删除
    public CommonResult delete(Serializable id);

    // 修改
    public CommonResult update(T entity);

    // 根据id查找
    public CommonResult getById(Serializable id);

    // 获取所有
    public CommonResult getAll();// 查看所有

    // 分页查询
    public CommonResult getByPage(int pageIndex, int pageNum,Map<String,String> query);

    //
    public T selectOne(Map<String, String> queryMap);
}