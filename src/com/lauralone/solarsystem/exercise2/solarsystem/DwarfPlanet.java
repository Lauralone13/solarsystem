package com.lauralone.solarsystem.exercise2.solarsystem;

public class DwarfPlanet extends SolarSystemObject {
	
	public DwarfPlanet(String name, double diameterScaleToEarth, int diameterInKm, double massScaleToEarth, double distanceToSunInAU, int confirmedMoons, int provisionalMoons, int totalMoons, String temperatureAtSurfaceInCelsius, double gravityAtEquatorScaleToEarth, String objectHasRings, String atmosphericComposition) {
		super(name, "Dwarf Planet", diameterScaleToEarth, diameterInKm, massScaleToEarth, distanceToSunInAU, confirmedMoons, provisionalMoons, totalMoons, temperatureAtSurfaceInCelsius, gravityAtEquatorScaleToEarth, objectHasRings, atmosphericComposition);
	}
}
