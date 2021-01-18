package com.britebill.springcontracttestlab.sponsorsms.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class PaymentDetails {
    @NonNull
    protected String holder;
    @NonNull
    protected String number;
    @NonNull
    protected String cvc;
    @NonNull
    protected String expiration;
    @NonNull
    protected double amount;
    protected String note;
}
