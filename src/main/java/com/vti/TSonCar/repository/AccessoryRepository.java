package com.vti.TSonCar.repository;

import com.vti.TSonCar.entity.Accessory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AccessoryRepository extends
        JpaRepository<Accessory, Long>, JpaSpecificationExecutor<Accessory> {
}
