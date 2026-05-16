package com.chrisnkl.backend.infrastructure.web.dto.rent_car;

import com.chrisnkl.backend.domain.model.Rental;

import java.math.BigDecimal;
import java.time.Instant;

public record RentCarResponse(

        String carId,
        String driverId,
        Rental.RentalDuration duration,
        Rental.RentalState state,
        BigDecimal amount,
        Boolean premium,
        Instant activatedAt
) {

    public RentCarResponse(Rental rental) {

        if (rental == null || rental.billing() == null || rental.billing().monthlyAmount() == null) {
            throw new IllegalArgumentException("Invalid rental billing information");
        }

        this(
                rental.carId().toString(),
                rental.driverId(),
                rental.duration(),
                rental.state(),
                rental.billing().monthlyAmount(),
                rental.premium(),
                rental.activatedAt()
        );
    }

}
