package com.example.health.entity;

import lombok.Data;

@Data
public class TbInforecord {
    private Integer recordId;

    private Integer stuId;

    private Integer collectionId;

    private String radioOption;

    private String mulselOptions;

    private Integer publishId;

    private String city;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    public String getRadioOption() {
        return radioOption;
    }

    public void setRadioOption(String radioOption) {
        this.radioOption = radioOption;
    }

    public String getMulselOptions() {
        return mulselOptions;
    }

    public void setMulselOptions(String mulselOptions) {
        this.mulselOptions = mulselOptions;
    }

    public Integer getPublishId() {
        return publishId;
    }

    public void setPublishId(Integer publishId) {
        this.publishId = publishId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}