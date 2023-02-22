package com.example.health.entity;

import lombok.Data;

import java.util.Date;

@Data
public class TbStutoinquiry {
    private Integer stuinquiryId;

    private Integer stuId;

    private Integer doctorId;

    private Date inquiryTime;

    private String stuodoc;

    private String inquiryContent;

    public Integer getStuinquiryId() {
        return stuinquiryId;
    }

    public void setStuinquiryId(Integer stuinquiryId) {
        this.stuinquiryId = stuinquiryId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Date getInquiryTime() {
        return inquiryTime;
    }

    public void setInquiryTime(Date inquiryTime) {
        this.inquiryTime = inquiryTime;
    }

    public String getStuodoc() {
        return stuodoc;
    }

    public void setStuodoc(String stuodoc) {
        this.stuodoc = stuodoc;
    }

    public String getInquiryContent() {
        return inquiryContent;
    }

    public void setInquiryContent(String inquiryContent) {
        this.inquiryContent = inquiryContent;
    }
}