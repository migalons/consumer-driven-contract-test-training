package com.britebill.springcontracttestlab.paymentsms;

import com.britebill.springcontracttestlab.paymentsms.dto.Payment;
import com.britebill.springcontracttestlab.paymentsms.dto.PaymentCreate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PaymentsService {

    protected List<Payment> paymentList;

    public PaymentsService() {
        this.paymentList = new ArrayList<>();
    }

    public Payment addPayment(PaymentCreate paymentCreate) {
        Payment payment = new Payment(paymentCreate);
        this.paymentList.add(payment);
        return payment;
    }

    public List<Payment> getPayments() {
        return this.paymentList;
    }

    public Optional<Payment> getPaymentById(String id) {
        Optional<Payment> paymentOptional = paymentList.stream()
                .filter(p -> p.getUuid().toString().equals(id)).findFirst();
        return paymentOptional;
    }
}
