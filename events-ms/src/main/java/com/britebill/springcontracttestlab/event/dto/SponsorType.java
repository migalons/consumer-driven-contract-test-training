package com.britebill.springcontracttestlab.event.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data @NoArgsConstructor @AllArgsConstructor
public class SponsorType {
    @NonNull
    protected String name;
    @NonNull
    protected double price;
}
