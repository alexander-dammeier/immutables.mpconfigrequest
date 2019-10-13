package de.dammeier.immutables.mpconfigrequest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.immutables.value.Value;
import org.immutables.value.Value.Style.ImplementationVisibility;

@Value.Style(
		visibility = ImplementationVisibility.PUBLIC, 
		typeAbstract = { "Abstract*", "I*" }, 
		typeImmutable = "*",
		depluralize = true)
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.PACKAGE, ElementType.TYPE})
public @interface ImmutablesStyle {}
