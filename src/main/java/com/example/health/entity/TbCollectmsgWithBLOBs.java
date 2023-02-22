package com.example.health.entity;


import lombok.Data;

@Data
public class TbCollectmsgWithBLOBs extends TbCollectmsg {
    private String radioCont;

    private String mulselCont;

    public String getRadioCont() {
        return radioCont;
    }

    public void setRadioCont(String radioCont) {
        this.radioCont = radioCont;
    }

    public String getMulselCont() {
        return mulselCont;
    }

    public void setMulselCont(String mulselCont) {
        this.mulselCont = mulselCont;
    }
}