package edu.ftn.iis.soas.ntf.facade.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import edu.ftn.iis.soas.ntf.facade.model.NotificationRequest;
import edu.ftn.iis.soas.ntf.facade.model.NotificationResponse;
import edu.ftn.iis.soas.ntf.facade.service.FacadeService;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@Primary
public class FacadeServiceImpl implements FacadeService {

	private RestTemplate restTemplate = new RestTemplate();
	
	@Override
	public NotificationResponse notify(NotificationRequest request) {
		
		log.trace("calling handler");
		
		String path = "http://localhost:8081/api/handler/handle";
		NotificationResponse response = restTemplate.postForObject(path, request, NotificationResponse.class);
		log.trace("response: " + response.toString());
		return response;
	}

}
