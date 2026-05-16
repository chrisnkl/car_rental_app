package com.chrisnkl.backend.domain.model;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public record Billing(

        UUID billingId,
        UUID rentalId,
        BigDecimal monthlyAmount,
        Instant createdAt

) {
}
