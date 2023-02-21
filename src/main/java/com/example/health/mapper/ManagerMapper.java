package com.example.community.mapper;

import com.example.community.entity.TbManager;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ManagerMapper extends BaseDao<TbManager> {
}
