package com.mezen.camion.entities;

import org.springframework.data.rest.core.config.Projection;

import com.mezen.camion.entities.Camion;

@Projection(name = "nomCam", types = { Camion.class })
public interface CamionProjection {
	public String getnomcamion();

}