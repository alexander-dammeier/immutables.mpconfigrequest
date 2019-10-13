package de.dammeier.immutables.mpconfigrequest;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
@Path("myentity")
public class APIEndpoint {
	
	@Inject
	@ConfigProperty(name="de.dammeier.immutables.mpconfigrequest.initentity")
	MyEntity entity ;//= MyEntity.builder().isActive(true).build();
	
	@PostConstruct
	public void init() {
		System.out.println(entity);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public MyEntity getMyEntity() {
		return entity;
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void setMyEntity(MyEntity entity) {
		this.entity = entity;
	}

}
