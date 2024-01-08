package com.vti.TSonCar.mapper;

import com.vti.TSonCar.dto.CarDto;
import com.vti.TSonCar.entity.Car;
import com.vti.TSonCar.form.CarCreateForm;
import com.vti.TSonCar.form.CarUpdateForm;

public class CarMapper {
    public static Car map(CarCreateForm form) {
        var car = new Car();
        var pk = new Car.PrimaryKey();
        pk.setLicensePlate(form.getLicensePlate());
        pk.setRepairDate(form.getRepairDate());
        car.setPk(pk);
        car.setCustomerName(form.getCustomerName());
        car.setCarMaker(form.getCarMaker());
        car.setCatalogs(form.getCatalogs());
        return car;
    }

    public static Car map(CarUpdateForm form) {
        var car = new Car();
        car.setCatalogs(form.getCatalogs());
        car.setCarMaker(form.getCarMaker());
        car.setCustomerName(form.getCustomerName());
        return car;
    }

    public static CarDto map(Car car) {
        var dto = new CarDto();
        var pk = car.getPk();
        dto.setLicensePlate(pk.getLicensePlate());
        dto.setRepairDate(pk.getRepairDate());
        dto.setCustomerName(car.getCustomerName());
        dto.setCatalogs(car.getCatalogs());
        dto.setCarMaker(car.getCarMaker());
        return dto;
    }

    public static void map(CarUpdateForm form, Car car) {
        car.setCustomerName(form.getCustomerName());
        car.setCatalogs(form.getCatalogs());
        car.setCarMaker(form.getCarMaker());
    }
}

