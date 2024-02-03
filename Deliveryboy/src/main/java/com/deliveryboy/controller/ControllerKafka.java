package com.deliveryboy.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deliveryboy.service.ServiceKafka;

@RestController
@RequestMapping("/location")
public class ControllerKafka {
	
	@Autowired
	private ServiceKafka serviceKafka;
	
	@PostMapping("/update")
	public ResponseEntity<?> updateLocation(){
		for(int i=1;i<=10000;i++) {
		this.serviceKafka.updateLocation("("+Math.round(Math.random()*100)+" , "+Math.round(Math.random())+")");
		System.out.println("--------------------");
		}
		return new ResponseEntity<>(Map.of("Message","Location Updated"),HttpStatus.OK);
	}
	
}
