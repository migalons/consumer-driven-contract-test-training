package com.britebill.springcontracttestlab.sponsorsms.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class SponsorCreate {
    @NonNull
    protected String name;
}
