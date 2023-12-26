package com.vti.TSonCar.service;

import com.vti.TSonCar.dto.CarDto;
import com.vti.TSonCar.entity.Car;
import com.vti.TSonCar.form.CarCreateForm;
import com.vti.TSonCar.form.CarUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CarService {
    Page<CarDto> findAll(Pageable pageable);
    CarDto create(CarCreateForm form);
    CarDto update(CarUpdateForm form);
    void deteleById(Car.PrimaryKey pk);

}
