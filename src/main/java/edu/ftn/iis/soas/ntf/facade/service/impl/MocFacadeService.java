package edu.ftn.iis.soas.ntf.facade.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import edu.ftn.iis.soas.ntf.facade.model.NotificationRequest;
import edu.ftn.iis.soas.ntf.facade.model.NotificationResponse;
import edu.ftn.iis.soas.ntf.facade.service.FacadeService;

@Service
public class MocFacadeService implements FacadeService{

	@Override
	public NotificationResponse notify(NotificationRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
