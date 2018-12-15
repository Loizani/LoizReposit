package org.loiz.AnnoTraining.Geometrie.configurations;

import org.loiz.AnnoTraining.Geometrie.SurfaceCercle;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfigDesSurfaces {

	
	public SurfaceCercle getCalculSurfaceCercle() {
		
		return new SurfaceCercle();
	}
	
}
