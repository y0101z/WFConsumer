package com.wf.consumer.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.wf.consumer.model.Click;
import com.wf.consumer.model.User;
import com.wf.consumer.service.ClicksService;
import com.wf.consumer.service.UsersService;

@Service
public class KafkaConsumer
{
	private final Logger log = LoggerFactory.getLogger(this.getClass());	
	@Autowired
	private UsersService usersService;
	@Autowired
	private ClicksService clicksService;

	@KafkaListener(topics = "users-topic", group = "group_json", containerFactory = "userKafkaListenerFactory")
	public void consumerUser(User user)
	{
		try
		{
			usersService.saveOrUpdate(user);
		}
		catch (Exception e)
		{			
			log.error(e.getMessage());
		}
		
		log.debug("User Event stored to Cassandra: {}", user);
	}
	
	@KafkaListener(topics = "clicks-topic", group = "group_json", containerFactory = "clickKafkaListenerFactory")
	public void consumeClick(Click click)
	{
		try
		{
			clicksService.saveOrUpdate(click);
		}
		catch (Exception e)
		{			
			log.error(e.getMessage());
		}
		
		log.debug("Click Event stored to Cassandra: {}", click);
	}
}
