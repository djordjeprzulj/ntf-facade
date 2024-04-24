package edu.ftn.iis.soas.ntf.facade.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import edu.ftn.iis.soas.domain.model.NotificationRequest;
import edu.ftn.iis.soas.domain.model.NotificationResponse;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class NtfHandlerClient {

	private RestTemplate restTemplate = new RestTemplate();
	
	@Value("${app.handlerUrl}")
	private String handlerUrl;
	
	public NotificationResponse notify(NotificationRequest request) {
				
		String path = "http://" + handlerUrl + "/api/handler/handle";
		log.info(path);
		
		NotificationResponse response = restTemplate.postForObject(path, request, NotificationResponse.class);
		// ResponseEntity<NotificationResponse> responseEntity = restTemplate.postForEntity(path, request, NotificationResponse.class);
		log.trace("response: " + response.toString());
		return response;
	}
}
