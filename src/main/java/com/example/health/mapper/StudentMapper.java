package com.example.health.mapper;

import com.example.health.entity.TbStudent;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StudentMapper extends BaseDao<TbStudent> {

}
