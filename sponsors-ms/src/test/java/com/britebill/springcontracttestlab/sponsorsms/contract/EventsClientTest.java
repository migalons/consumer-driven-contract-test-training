package com.britebill.springcontracttestlab.sponsorsms.contract;

import com.britebill.springcontracttestlab.sponsorsms.EventsClient;
import com.britebill.springcontracttestlab.sponsorsms.dto.Event;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureStubRunner(
        ids = "com.britebill.spring-contract-test-lab:events-ms:0.0.1-SNAPSHOT:stubs:8100",
        stubsMode = StubRunnerProperties.StubsMode.LOCAL
)
public class EventsClientTest {


    @Autowired
    private EventsClient eventsClient;

    @Test
    public void get_person_from_service_contract() {

        ResponseEntity<Event> response = this.eventsClient.getEvent("2b116fca-37cf-478e-b1ff-f0c12eb91279");

        assert (response.getStatusCode().equals(HttpStatus.OK));

        assert (response.getBody().getSponsorTypes().size() > 0);
        assert (response.getBody().getSponsorTypes().get(0).getName() != null && !response.getBody().getSponsorTypes().get(0).getName().isEmpty());
        assert (response.getBody().getSponsorTypes().get(0).getPrice() > 0);

    }


}