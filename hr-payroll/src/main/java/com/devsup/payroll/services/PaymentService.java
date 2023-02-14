package com.devsup.payroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.devsup.payroll.entities.Payment;
import com.devsup.payroll.entities.Worker;

@Service
public class PaymentService {

	@Value("${hr-worker.host}")
	private String workerHost;

	@Autowired
	private RestTemplate restTemplate;

	public Payment getPayment(Long workedId, int days) {

		Map<String, String> uriVariable = new HashMap<>();

		uriVariable.put("id", workedId.toString());

		Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariable);
		return new Payment(worker.getName(), worker.getDailyIncome(), days);

	}

}
