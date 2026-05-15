package com.chrisnkl.backend.domain.port.in.rent_car;

import com.chrisnkl.backend.common.StringsLib;
import com.chrisnkl.backend.domain.exception.RentCarValidationException;
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

    public RentCarCommand {
        String errorMessage = "Failed to validate rent car command. (error=%s)";

        if (!StringsLib.isValid(carId)) {
            throw new RentCarValidationException(String.format(errorMessage, "Invalid car id"));
        }

        if (!StringsLib.isValid(driverId)) {
            throw new RentCarValidationException(String.format(errorMessage, "Invalid driver id"));
        }

        if (amount != null && amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new RentCarValidationException(String.format(errorMessage, "Invalid amount is less than zero"));
        }

    }

}
