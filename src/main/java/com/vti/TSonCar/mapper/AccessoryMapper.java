package com.vti.TSonCar.mapper;

import com.vti.TSonCar.dto.AccessoryDto;
import com.vti.TSonCar.entity.Accessory;
import com.vti.TSonCar.entity.Car;
import com.vti.TSonCar.form.AccessoryCreateForm;
import com.vti.TSonCar.form.AccessoryUpdateForm;

public class AccessoryMapper {
    public static Accessory map(AccessoryCreateForm form) {
        var accessory = new Accessory();
        accessory.setName(form.getName());
        accessory.setPrice(form.getPrice());
        accessory.setRepairStatus(form.getRepairStatus());
        accessory.setStatusDamaged(form.getStatusDamaged());
        return accessory;
    }

    public static AccessoryDto map(Accessory accessory) {
        var dto = new AccessoryDto();
        dto.setId(accessory.getId());
        var carPk = accessory.getCar().getPk();
        dto.setLicensePlate(carPk.getLicensePlate());
        dto.setRepairDate(carPk.getRepairDate());
        dto.setName(accessory.getName());
        dto.setPrice(accessory.getPrice());
        dto.setStatusDamaged(accessory.getStatusDamaged());
        dto.setRepairStatus(accessory.getRepairStatus());
        return dto;
    }

    public static void map(AccessoryUpdateForm form, Accessory accessory) {
        accessory.setName(form.getName());
        accessory.setPrice(form.getPrice());
        accessory.setRepairStatus(form.getRepairStatus());
        accessory.setStatusDamaged(form.getStatusDamaged());
    }
}
