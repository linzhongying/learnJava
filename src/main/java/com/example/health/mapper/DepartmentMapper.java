package com.example.health.mapper;


import com.example.health.entity.TbDepartment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DepartmentMapper extends BaseDao<TbDepartment> {

}
