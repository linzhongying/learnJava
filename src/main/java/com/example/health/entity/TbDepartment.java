package com.example.health.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tb_department")
public class TbDepartment {
    @TableId("Depart_id")
    private Short departId;

    private String departName;

    public TbDepartment(short departId,String departName){
        this.departId=departId;
        this.departName=departName;
    }

    public Short getDepartId() {
        return departId;
    }

    public void setDepartId(Short departId) {
        this.departId = departId;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }
}