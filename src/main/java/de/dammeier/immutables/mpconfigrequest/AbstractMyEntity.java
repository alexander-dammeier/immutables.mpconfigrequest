package de.dammeier.immutables.mpconfigrequest;

import java.util.Set;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Value.Immutable
@ImmutablesStyle
@Gson.TypeAdapters
abstract class AbstractMyEntity {

	public abstract boolean isActive();
	public abstract Set<String> getItems();
	
	public boolean hasItems() {
		return !this.getItems().isEmpty();
	}
}
