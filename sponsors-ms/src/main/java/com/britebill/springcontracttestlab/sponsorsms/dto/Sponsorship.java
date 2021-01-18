package com.britebill.springcontracttestlab.sponsorsms.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Sponsorship {

    protected final UUID uuid;
    protected String eventId;
    protected String sponsorType;
    protected String paymentId;
    protected LocalDateTime payDate;

    public Sponsorship() {
        this.uuid = UUID.randomUUID();
    }

}
