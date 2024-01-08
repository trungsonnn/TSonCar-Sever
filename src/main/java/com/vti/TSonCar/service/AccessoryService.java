package com.vti.TSonCar.service;

import com.vti.TSonCar.dto.AccessoryDto;
import com.vti.TSonCar.dto.CarDto;
import com.vti.TSonCar.entity.Car;
import com.vti.TSonCar.form.AccessoryCreateForm;
import com.vti.TSonCar.form.AccessoryUpdateForm;
import com.vti.TSonCar.form.CarCreateForm;
import com.vti.TSonCar.form.CarUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AccessoryService {
    Page<AccessoryDto> findAll(Pageable pageable);
    AccessoryDto create(AccessoryCreateForm form);
    AccessoryDto update(AccessoryUpdateForm form, Long id);
    void deteleById(Long id);
}
