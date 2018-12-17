package org.loiz.AnnoTrainng.Telephonie.configuration;

import org.loiz.AnnoTrainng.Telephonie.common.InterfaceMondeDuMobile;
import org.loiz.AnnoTrainng.Telephonie.common.ServiceMondeDuMobile;
import org.loiz.AnnoTrainng.Telephonie.common.implementedMondeDuMobile;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigTelephonie {


	@Bean 
	public InterfaceMondeDuMobile getInterfaceServiceMondeDuMobile()  {
		
		return new implementedMondeDuMobile();		
	}
	
	@Bean 	
	ServiceMondeDuMobile  getServiceMondeDuMobile()  {
		
		return new ServiceMondeDuMobile();		
	}
	
}
