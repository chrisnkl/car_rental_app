package com.chrisnkl.backend.infrastructure.web.controller;

import com.chrisnkl.backend.domain.model.Rental;
import com.chrisnkl.backend.domain.port.in.rent_car.RentCarUseCase;
import com.chrisnkl.backend.infrastructure.web.dto.BackendResponse;
import com.chrisnkl.backend.infrastructure.web.dto.rent_car.RentCarRequest;
import com.chrisnkl.backend.infrastructure.web.dto.rent_car.RentCarResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/rent")
@RestController
public class RentCarController {

    private final RentCarUseCase rentCarUseCase;

    @PostMapping
    public ResponseEntity<BackendResponse<RentCarResponse>> rentCar(@Valid @RequestBody RentCarRequest request) {

        log.info("Received http request for rent creation: {}", Instant.now());

        RentCarResponse response = new RentCarResponse(rentCarUseCase.execute(request.toCommand()));

    }

}
