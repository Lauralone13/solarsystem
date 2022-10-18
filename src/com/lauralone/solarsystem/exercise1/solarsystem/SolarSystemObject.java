package com.lauralone.solarsystem.exercise1.solarsystem;

import java.util.Objects;

public class SolarSystemObject {
	
	private final String name;
	private final String type;
	
	public SolarSystemObject(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		SolarSystemObject that = (SolarSystemObject) o;
		return Objects.equals(name, that.name) && Objects.equals(type, that.type);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, type);
	}
	
	@Override
	public String toString() {
		return "SolarSystemObject{" + "name='" + name + '\'' + ", type='" + type + '\'' + '}';
	}
}
