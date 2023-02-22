package com.example.health.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbClass implements Serializable {

    private Long classId;

    private Byte classNum;

    private Short grade;

    private Integer profId;

    private Integer teacherId;

    private Byte stuNum;
}