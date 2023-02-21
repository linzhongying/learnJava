package com.example.community.mapper;

import com.example.community.entity.TbDoctor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DoctorMapper extends BaseDao<TbDoctor>{
}
