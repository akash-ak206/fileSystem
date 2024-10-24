package com.sak.filesystem.data;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
public class BrandArea {

    private Long id;
    private int brand;
    private int department;
    private String brandName;
    private String deptName;
    private String floor;
    private String zone;
    private String building;
    private int location;


    @Override
    public String toString() {
        return "BrandArea{" +
                "id=" + id +
                ", brand=" + brand +
                ", department=" + department +
                ", brandName='" + brandName + '\'' +
                ", deptName='" + deptName + '\'' +
                ", floor='" + floor + '\'' +
                ", zone='" + zone + '\'' +
                ", building='" + building + '\'' +
                ", location=" + location +
                '}';
    }
}
