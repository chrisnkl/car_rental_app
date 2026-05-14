package com.chrisnkl.backend.domain.model;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Set;
import java.util.UUID;

public record Car(

        UUID id,
        CarBrand brand,
        CarModel model,
        CarType type,
        Set<CarHistory> history,
        String vinNumber,
        String licensePlate,
        Integer mileage,
        Integer seats,
        Boolean available,
        BigDecimal monthlyCost,
        Instant createdAt,
        Instant updatedAt

) {

    public record CarBrand(

            String brand,
            String countryOrigin
    ) { }

    public record CarModel(

            String model,
            Integer year

    ) { }

    public record CarHistory(

        Long id,
        String driverId,
        Boolean premium,
        Instant startDate,
        Instant endDate,
        Instant createdAt
    ) { }

    public enum CarType {

        PETROL, GAS, DIESEL, HYBRID, ELECTRIC

    }


}



