package edu.ftn.iis.soas.ntf.facade.service;

import edu.ftn.iis.soas.domain.model.NotificationRequest;
import edu.ftn.iis.soas.domain.model.NotificationResponse;

public interface FacadeService {

	NotificationResponse notify(NotificationRequest request);
	
}
