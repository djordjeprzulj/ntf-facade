package edu.ftn.iis.soas.ntf.facade.service;

import edu.ftn.iis.soas.ntf.facade.model.NotificationRequest;
import edu.ftn.iis.soas.ntf.facade.model.NotificationResponse;

public interface FacadeService {

	NotificationResponse notify(NotificationRequest request);
	
}
