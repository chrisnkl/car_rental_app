package com.chrisnkl.backend.domain.port.in.rent_car;

import com.chrisnkl.backend.domain.model.Rental;

public interface RentCarUseCase {

    Rental execute(RentCarCommand command);

}
