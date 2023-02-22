package com.example.health.mapper;

import com.example.health.entity.TbDoctor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DoctorMapper extends BaseDao<TbDoctor>{
}
