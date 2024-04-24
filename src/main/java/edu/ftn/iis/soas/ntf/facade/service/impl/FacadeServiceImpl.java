package edu.ftn.iis.soas.ntf.facade.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import edu.ftn.iis.soas.domain.model.NotificationRequest;
import edu.ftn.iis.soas.domain.model.NotificationResponse;
import edu.ftn.iis.soas.ntf.facade.client.NtfHandlerClient;
import edu.ftn.iis.soas.ntf.facade.service.FacadeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@Primary
@RequiredArgsConstructor
public class FacadeServiceImpl implements FacadeService {

	private final NtfHandlerClient ntfHandlerClient;
	
	@Override
	public NotificationResponse notify(NotificationRequest request) {
		log.trace("calling handler");
		return ntfHandlerClient.notify(request);
	}

}
