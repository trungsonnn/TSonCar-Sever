package com.vti.TSonCar.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class AccessoryDto {
    private Long id;
    private String LicensePlate;
    private LocalDate RepairDate;
    private String name;
    private Long price;
    private String statusDamaged;
    private String repairStatus;
}
