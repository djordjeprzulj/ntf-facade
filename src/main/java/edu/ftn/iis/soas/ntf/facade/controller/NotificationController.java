package edu.ftn.iis.soas.ntf.facade.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ftn.iis.soas.domain.model.NotificationRequest;
import edu.ftn.iis.soas.domain.model.NotificationResponse;
import edu.ftn.iis.soas.ntf.facade.service.FacadeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/notification")
@Slf4j
@RequiredArgsConstructor
public class NotificationController {

	private final FacadeService facadeService;
	
	@PostMapping("/notify")
	public NotificationResponse notify(@RequestBody NotificationRequest request) {
		log.trace("request received: " + request);
		return facadeService.notify(request);
	}
	
}
