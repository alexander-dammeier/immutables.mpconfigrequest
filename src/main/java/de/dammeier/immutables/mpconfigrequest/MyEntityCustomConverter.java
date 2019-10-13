package de.dammeier.immutables.mpconfigrequest;

import org.eclipse.microprofile.config.spi.Converter;

import com.google.gson.GsonBuilder;

public class MyEntityCustomConverter implements Converter<MyEntity> {

	@Override
	public MyEntity convert(String value) {
		GsonBuilder builder = new GsonBuilder();
		com.google.gson.Gson gson = builder.create();
		return gson.fromJson(value, MyEntity.class);
	}

}
