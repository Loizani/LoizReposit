package org.loiz.AnnoTrainng.Telephonie.configuration;

//import org.loiz.AnnoTrainng.Telephonie.common.InterfaceMondeDuMobile;
//import org.loiz.AnnoTrainng.Telephonie.common.ServiceMondeDuMobile;
//import org.loiz.AnnoTrainng.Telephonie.common.implementedMondeDuMobile;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="org.loiz.AnnoTrainng.Telephonie")
public class AppConfigTelephonie {


	@Bean 
	public void getInterfaceServiceMondeDuMobile()  {		
				System.out.println("Dans le bean de la config qui ne fait pas de wiring");
	}
	
//	@Bean 	
//	ServiceMondeDuMobile  getServiceMondeDuMobile()  {
//		
//		return new ServiceMondeDuMobile();		
//	}
	
}
