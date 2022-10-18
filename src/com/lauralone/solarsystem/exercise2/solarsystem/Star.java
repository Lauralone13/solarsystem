package com.lauralone.solarsystem.exercise2.solarsystem;

public class Star extends SolarSystemObject {
	
	public Star(double diameterScaleToEarth, int diameterInKm, double massScaleToEarth, double distanceToSunInAU, int confirmedMoons, int provisionalMoons, int totalMoons, String temperatureAtSurfaceInCelsius, double gravityAtEquatorScaleToEarth, String objectHasRings, String atmosphericComposition) {
		super("Sun", "Star", diameterScaleToEarth, diameterInKm, massScaleToEarth, distanceToSunInAU, confirmedMoons, provisionalMoons, totalMoons, temperatureAtSurfaceInCelsius, gravityAtEquatorScaleToEarth, objectHasRings, atmosphericComposition);
	}
}
