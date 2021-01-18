package com.britebill.springcontracttestlab.sponsorsms.dto;

import com.britebill.springcontracttestlab.sponsorsms.SponsorStatus;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
public class Sponsor {

    protected UUID uuid;
    protected String name;
    protected List sponsorShips;
    protected SponsorStatus status;

    public Sponsor(SponsorCreate sponsorCreate) {
        this.uuid = UUID.randomUUID();
        this.name = sponsorCreate.name;
        this.sponsorShips = new ArrayList();
        this.status = SponsorStatus.ACTIVE;
    }

    public boolean equals(Sponsor sponsor) {
        return this.uuid == sponsor.uuid &&
                this.getName().equals(sponsor.getName());
    }
}
