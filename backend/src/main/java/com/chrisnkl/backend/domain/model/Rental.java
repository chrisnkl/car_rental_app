package com.chrisnkl.backend.domain.model;

import java.time.Instant;
import java.util.Set;
import java.util.UUID;

public record Rental(

        UUID rentalId,
        UUID carId,
        String driverId,
        RentalDuration duration,
        Set<Billing> billing,
        RentalState state,
        Boolean premium,
        Instant activatedAt,
        Instant terminatedAt,
        Instant createdAt,
        Instant updatedAt
) {

    public enum RentalState {

        ACTIVE,
        TERMINATED

    }

    public enum RentalDuration {

        MONTHLY,
        SEMI_ANNUAL,
        ANNUAL

    }

}
