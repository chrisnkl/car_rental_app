package com.chrisnkl.backend.domain.port.out;

import com.chrisnkl.backend.domain.model.Rental;

import java.util.Optional;

public interface RentalRepository {

    Rental save(Rental rental);
    Optional<Rental> findById(String rentalId);
    Optional<Rental> findByDriverId(String driverId);

}
