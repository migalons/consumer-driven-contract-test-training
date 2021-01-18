package com.britebill.springcontracttestlab.paymentsms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public PaymentsService getPaymentsService() {
        return new PaymentsService();
    }

}
