package com.example.health.entity;

import lombok.Data;

@Data
public class TbProfession {

    private Short profId;

    private String profName;

    private Short departId;

    public Short getProfId() {
        return profId;
    }

    public void setProfId(Short profId) {
        this.profId = profId;
    }

    public String getProfName() {
        return profName;
    }

    public void setProfName(String profName) {
        this.profName = profName;
    }

    public Short getDepartId() {
        return departId;
    }

    public void setDepartId(Short departId) {
        this.departId = departId;
    }
}