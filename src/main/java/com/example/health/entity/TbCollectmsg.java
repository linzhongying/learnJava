package com.example.health.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tb_department")
public class TbCollectmsg {
    @TableId("Depart_id")
    private Integer collectionId;

    private String radioomulti;

    private String radioTitle;

    private String mulselTitle;

    private String collectionTitle;

    private Integer teacherId;

    public Integer getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    public String getRadioomulti() {
        return radioomulti;
    }

    public void setRadioomulti(String radioomulti) {
        this.radioomulti = radioomulti;
    }

    public String getRadioTitle() {
        return radioTitle;
    }

    public void setRadioTitle(String radioTitle) {
        this.radioTitle = radioTitle;
    }

    public String getMulselTitle() {
        return mulselTitle;
    }

    public void setMulselTitle(String mulselTitle) {
        this.mulselTitle = mulselTitle;
    }

    public String getCollectionTitle() {
        return collectionTitle;
    }

    public void setCollectionTitle(String collectionTitle) {
        this.collectionTitle = collectionTitle;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
}