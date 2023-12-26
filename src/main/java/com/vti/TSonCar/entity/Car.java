package com.vti.TSonCar.entity;

import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "license_plate")
    private String liscense_plate;
}
