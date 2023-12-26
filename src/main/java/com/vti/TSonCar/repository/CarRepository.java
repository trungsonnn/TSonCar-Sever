package com.vti.TSonCar.repository;

import com.vti.TSonCar.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


public interface CarRepository extends JpaRepository<Car,Car.PrimaryKey>, JpaSpecificationExecutor<Car> {
}
