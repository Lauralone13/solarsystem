package com.lauralone.solarsystem.exercise1.solarsystem;

import java.util.Objects;

public class Star extends SolarSystemObject {
	
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
	
	public Star(double diameterScaleToEarth, int diameterInKm, double massScaleToEarth, double distanceToSunInAU, int confirmedMoons, int provisionalMoons, int totalMoons, String temperatureAtSurfaceInCelsius, double gravityAtEquatorScaleToEarth, String objectHasRings, String atmosphericComposition) {
		super("Sun", "Star");
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
		if (! super.equals(o))
			return false;
		Star star = (Star) o;
		return Double.compare(star.diameterScaleToEarth, diameterScaleToEarth) == 0 && diameterInKm == star.diameterInKm && Double.compare(star.massScaleToEarth, massScaleToEarth) == 0 && Double.compare(star.distanceToSunInAU, distanceToSunInAU) == 0 && confirmedMoons == star.confirmedMoons && provisionalMoons == star.provisionalMoons && totalMoons == star.totalMoons && Double.compare(star.gravityAtEquatorScaleToEarth, gravityAtEquatorScaleToEarth) == 0 && Objects.equals(temperatureAtSurfaceInCelsius, star.temperatureAtSurfaceInCelsius) && Objects.equals(objectHasRings, star.objectHasRings) && Objects.equals(atmosphericComposition, star.atmosphericComposition);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), diameterScaleToEarth, diameterInKm, massScaleToEarth, distanceToSunInAU, confirmedMoons, provisionalMoons, totalMoons, temperatureAtSurfaceInCelsius, gravityAtEquatorScaleToEarth, objectHasRings, atmosphericComposition);
	}
	
	@Override
	public String toString() {
		return "Star{" + "diameterScaleToEarth=" + diameterScaleToEarth + ", diameterInKm=" + diameterInKm + ", massScaleToEarth=" + massScaleToEarth + ", distanceToSunInAU=" + distanceToSunInAU + ", confirmedMoons=" + confirmedMoons + ", provisionalMoons=" + provisionalMoons + ", totalMoons=" + totalMoons + ", temperatureAtSurfaceInCelsius='" + temperatureAtSurfaceInCelsius + '\'' + ", gravityAtEquatorScaleToEarth=" + gravityAtEquatorScaleToEarth + ", objectHasRings='" + objectHasRings + '\'' + ", atmosphericComposition='" + atmosphericComposition + '\'' + '}';
	}
}
