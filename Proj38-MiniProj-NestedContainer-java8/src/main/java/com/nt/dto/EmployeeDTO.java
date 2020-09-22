package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeDTO implements Serializable{
    private  int projId;
    private String company;
    private float cost;
    private String location;
    private String projName;
    private int teamSize;
    
}
