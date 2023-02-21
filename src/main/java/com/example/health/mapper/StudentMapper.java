package com.example.community.mapper;

import com.example.community.entity.TbStudent;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StudentMapper extends BaseDao<TbStudent> {

}
