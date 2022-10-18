package com.lauralone.solarsystem.exercise2.solarsystem;

import java.util.Objects;

public class SolarSystemObject {
	
	private final String name;
	private final String type;
	private final double diameterScaleToEarth;
	private final int diameterInKm;
	private final double massScaleToEarth;
	private final double distanceToSunInAU;
	private final int confirmedMoons;
	private final int provisionalMoons;
	private final int totalMoons;
	private final String temperatureAtSurfaceInCelsius;
	private final double gravityAtEquatorScaleToEarth;
	private final String objectHasRings;
	private final String atmosphericComposition;
	
	public SolarSystemObject(String name, String type, double diameterScaleToEarth, int diameterInKm, double massScaleToEarth, double distanceToSunInAU, int confirmedMoons, int provisionalMoons, int totalMoons, String temperatureAtSurfaceInCelsius, double gravityAtEquatorScaleToEarth, String objectHasRings, String atmosphericComposition) {
		this.name = name;
		this.type = type;
		this.diameterScaleToEarth = diameterScaleToEarth;
		this.diameterInKm = diameterInKm;
		this.massScaleToEarth = massScaleToEarth;
		this.distanceToSunInAU = distanceToSunInAU;
		this.confirmedMoons = confirmedMoons;
		this.provisionalMoons = provisionalMoons;
		this.totalMoons = totalMoons;
		this.temperatureAtSurfaceInCelsius = temperatureAtSurfaceInCelsius;
		this.gravityAtEquatorScaleToEarth = gravityAtEquatorScaleToEarth;
		this.objectHasRings = objectHasRings;
		this.atmosphericComposition = atmosphericComposition;
	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public double getDiameterScaleToEarth() {
		return diameterScaleToEarth;
	}
	
	public int getDiameterInKm() {
		return diameterInKm;
	}
	
	public double getMassScaleToEarth() {
		return massScaleToEarth;
	}
	
	public double getDistanceToSunInAU() {
		return distanceToSunInAU;
	}
	
	public int getConfirmedMoons() {
		return confirmedMoons;
	}
	
	public int getProvisionalMoons() {
		return provisionalMoons;
	}
	
	public int getTotalMoons() {
		return totalMoons;
	}
	
	public String getTemperatureAtSurfaceInCelsius() {
		return temperatureAtSurfaceInCelsius;
	}
	
	public double getGravityAtEquatorScaleToEarth() {
		return gravityAtEquatorScaleToEarth;
	}
	
	public String getObjectHasRings() {
		return objectHasRings;
	}
	
	public String getAtmosphericComposition() {
		return atmosphericComposition;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		SolarSystemObject that = (SolarSystemObject) o;
		return Double.compare(that.diameterScaleToEarth, diameterScaleToEarth) == 0 && diameterInKm == that.diameterInKm && Double.compare(that.massScaleToEarth, massScaleToEarth) == 0 && Double.compare(that.distanceToSunInAU, distanceToSunInAU) == 0 && confirmedMoons == that.confirmedMoons && provisionalMoons == that.provisionalMoons && totalMoons == that.totalMoons && Double.compare(that.gravityAtEquatorScaleToEarth, gravityAtEquatorScaleToEarth) == 0 && Objects.equals(name, that.name) && Objects.equals(type, that.type) && Objects.equals(temperatureAtSurfaceInCelsius, that.temperatureAtSurfaceInCelsius) && Objects.equals(objectHasRings, that.objectHasRings) && Objects.equals(atmosphericComposition, that.atmosphericComposition);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, type, diameterScaleToEarth, diameterInKm, massScaleToEarth, distanceToSunInAU, confirmedMoons, provisionalMoons, totalMoons, temperatureAtSurfaceInCelsius, gravityAtEquatorScaleToEarth, objectHasRings, atmosphericComposition);
	}
	
	@Override
	public String toString() {
		return "SolarSystemObject{" + "name='" + name + '\'' + ", type='" + type + '\'' + ", diameterScaleToEarth=" + diameterScaleToEarth + ", diameterInKm=" + diameterInKm + ", massScaleToEarth=" + massScaleToEarth + ", distanceToSunInAU=" + distanceToSunInAU + ", confirmedMoons=" + confirmedMoons + ", provisionalMoons=" + provisionalMoons + ", totalMoons=" + totalMoons + ", temperatureAtSurfaceInCelsius='" + temperatureAtSurfaceInCelsius + '\'' + ", gravityAtEquatorScaleToEarth=" + gravityAtEquatorScaleToEarth + ", objectHasRings='" + objectHasRings + '\'' + ", atmosphericComposition='" + atmosphericComposition + '\'' + '}';
	}
}
