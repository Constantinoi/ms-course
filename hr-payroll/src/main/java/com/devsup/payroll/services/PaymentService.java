package com.devsup.payroll.services;

import org.springframework.stereotype.Service;

import com.devsup.payroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(Long workedId, int days) {

		return new Payment("Bob", 200.0, days);

	}

}
