package org.loiz.AnnoTraining.Geometrie.configurations;

import org.loiz.AnnoTraining.Geometrie.ObjetGeometrique;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

 
@Configuration
public class AppConfigDesSurfaces {

	@Bean(name="ObjetGeometrique")
	public ObjetGeometrique getCalculSurfaceCercle() {
		
		return new ObjetGeometrique();
	}
	
}
