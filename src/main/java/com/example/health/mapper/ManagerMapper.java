package com.example.health.mapper;

import com.example.health.entity.TbManager;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ManagerMapper extends BaseDao<TbManager> {
}
