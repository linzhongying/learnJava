package com.example.community.mapper;

import com.example.community.entity.TbProfession;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProfessionMapper extends BaseDao<TbProfession> {
    // 获取专业信息，包括学院信息
    @Select("select a.prof_id,a.prof_name,b.depart_name from tb_profession as a inner join tb_department as b on a.depart_id = b.depart_id limit #{current},#{size}")
    List<Object> getAllProf(@Param("current")int current, @Param("size")int size);
}
