package com.chrisnkl.backend.infrastructure.web.dto.rent_car;

import com.chrisnkl.backend.domain.port.in.rent_car.RentCarCommand;

public record RentCarRequest(



) {

    public RentCarCommand toCommand() {
        return new RentCarCommand(null, null, null, null, null, null);
    }
}
