package com.chrisnkl.backend.domain.model;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public record Billing(

        UUID rentalId,
        BillingState state,
        BillingMethod paymentMethod,
        BigDecimal amount,
        Instant paidAt,
        Instant dueDate,
        Instant createdAt

) {

    public enum BillingState {

       UNPAID,
       PAID

    }

    public enum BillingMethod {

        CREDIT_CARD,
        DEBIT_CARD,
        PAYPAL,
        STRIPE
    }

}
