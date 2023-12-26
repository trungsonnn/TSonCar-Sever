package com.vti.TSonCar.controller;
import com.vti.TSonCar.dto.CarDto;
import com.vti.TSonCar.entity.Car;
import com.vti.TSonCar.form.CarCreateForm;
import com.vti.TSonCar.form.CarUpdateForm;
import com.vti.TSonCar.service.CarService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@AllArgsConstructor
public class CarController {
    private final CarService carService;

    @GetMapping("/api/v1/cars")
    public Page<CarDto> findAll(Pageable pageable) {
        return carService.findAll(pageable);
    }

    @PostMapping("/api/v1/cars")
    public CarDto create(@RequestBody @Valid CarCreateForm form) {
        return carService.create(form);
    }

    @PutMapping("/api/v1/cars")
    public CarDto update(@RequestBody @Valid CarUpdateForm form) {
        return carService.update(form);
    }

    @DeleteMapping("/api/v1/cars")
    public void deleteById(@RequestBody Car.PrimaryKey id) {
        carService.deteleById(id);
    }
}
