package com.enduser.ConsumerConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.enduser.Const.AppConst;

@Configuration
public class ConsumerKafka {

	
	@KafkaListener(topics = AppConst.LOCATION_UPDTAE_NAME, groupId = AppConst.GROUP_ID)
	public void UpdatedLoc(String value) {
		System.out.println(value);
	}
}
