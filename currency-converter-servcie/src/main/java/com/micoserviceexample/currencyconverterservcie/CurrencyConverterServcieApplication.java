package com.micoserviceexample.currencyconverterservcie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CurrencyConverterServcieApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConverterServcieApplication.class, args);
	}

}
