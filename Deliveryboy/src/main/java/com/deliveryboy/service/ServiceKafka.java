package com.deliveryboy.service;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;

import com.deliveryboy.config.AppConst;




@Service
public class ServiceKafka {

	@Autowired
	private KafkaTemplate< String, String> kafkaTemplate;
	
	
	private Logger logger = LoggerFactory.getLogger(ServiceKafka.class);
	
	public boolean updateLocation(String location) {
		
			this.kafkaTemplate.send(AppConst.LOCATION_TOPIC_NAME,location);
			this.logger.info("Messeage Produced");
		return true;
	}
	
}
