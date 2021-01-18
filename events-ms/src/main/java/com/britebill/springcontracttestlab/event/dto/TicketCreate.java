package com.britebill.springcontracttestlab.event.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class TicketCreate {

    @NonNull
    protected String holder;
    @NonNull
    protected PaymentDetails paymentDetails;


}
