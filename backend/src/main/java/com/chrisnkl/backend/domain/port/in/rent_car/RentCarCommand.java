package com.chrisnkl.backend.domain.port.in.rent_car;

import com.chrisnkl.backend.domain.model.Rental;

import java.math.BigDecimal;
import java.util.UUID;

public record RentCarCommand(

        UUID carId,
        String driverId,
        Rental.RentalDuration duration,
        BigDecimal amount,
        Boolean premium,
        String idempotencyKey

) {

}
