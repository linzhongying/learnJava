package com.example.community.service.Impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.example.community.common.CommonResult;
import com.example.community.mapper.BaseDao;
import com.example.community.service.BaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
public class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    private BaseDao<T> baseDao;

    private List<T> list = null;
    private QueryWrapper<T> queryWrapper = null;
    private T t = null;
    private Page page = null;
    private Map<String,Object> map = null;

    @Override
    public T login(Map<String, String> queryMap) {
        queryWrapper = new QueryWrapper<T>();
        queryWrapper.allEq(queryMap);
        t = baseDao.selectOne(queryWrapper);
        return t;
    }

    @Override
    public T selectOne(Map<String, String> queryMap) {
        queryWrapper = new QueryWrapper<T>();
        queryWrapper.allEq(queryMap);
        t = baseDao.selectOne(queryWrapper);
        return t;
    }

    @Override
    public CommonResult add(T entity) {
        try{
            int i = baseDao.insert(entity);
            if(i==0)return CommonResult.failed("添加失败");
            return CommonResult.success("添加成功");
        }catch (Exception e){
            return CommonResult.failed("添加失败");
        }

    }

    @Override
    public CommonResult delete(Serializable id) {
        int i = baseDao.deleteById(id);
        if(i==0)return CommonResult.failed("删除失败");
        return CommonResult.success(null,"删除成功");
    }

    @Override
    public CommonResult update(T entity) {
        if(entity==null)return CommonResult.failed("不能为空");

        int i = baseDao.updateById(entity);
        if(i==0)return CommonResult.failed("修改失败");
        return CommonResult.success(null,"修改成功");
    }

    @Override
    public CommonResult getById(Serializable id) {
        t = baseDao.selectById(id);
        if(t==null)return CommonResult.failed("获取失败");
        return CommonResult.success(t,"获取成功");
    }

    // 获取所有
    @Override
    public CommonResult getAll() {
        queryWrapper = new QueryWrapper<T>();
        list = baseDao.selectList(queryWrapper);
        if(list==null)return CommonResult.failed("获取失败");
        return CommonResult.success(list,"获取成功");
    }

    // 分页查询
    @Override
    public CommonResult getByPage(int pageIndex, int pageNum,Map<String,String> query) {
        queryWrapper = null;
        if(query!=null){
            queryWrapper = new QueryWrapper<>();
            queryWrapper.allEq(query);
        }
        map = new ConcurrentHashMap<String,Object>();
        page = new Page(pageIndex, pageNum);
        IPage<T> iPage = baseDao.selectPage(page,queryWrapper);
        list = iPage.getRecords();
        if(list.size()==0)return CommonResult.failed("暂无数据");
        map.put("data",list);
        map.put("total",iPage.getTotal());
        if(list==null)return CommonResult.failed("获取失败");
        return CommonResult.success(map);
    }

}