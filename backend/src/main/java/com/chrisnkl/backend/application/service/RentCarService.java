package com.chrisnkl.backend.application.service;

import com.chrisnkl.backend.domain.model.Rental;
import com.chrisnkl.backend.domain.port.in.rent_car.RentCarCommand;
import com.chrisnkl.backend.domain.port.in.rent_car.RentCarUseCase;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RentCarService implements RentCarUseCase {


    @Override
    public Rental execute(RentCarCommand command) {
        return null;
    }
}
