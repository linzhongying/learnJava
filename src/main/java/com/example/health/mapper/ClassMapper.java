package com.example.health.mapper;

import com.example.health.entity.TbClass;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ClassMapper extends BaseDao<TbClass> {

    @Select("select a.class_id,a.class_num,a.grade,a.stu_num,b.prof_name,c.depart_name,d.teacher_name from tb_class as a left join tb_profession as b on a.prof_id = b.prof_id left join tb_department as c on b.depart_id = c.depart_id right join tb_teacher as d on a.teacher_id = d.teacher_id limit #{current},#{size}")
    public List<Object> getAllClass(@Param("current")int current, @Param("size")int size);
}
