package com.lauralone.solarsystem.exercise1;

import com.lauralone.solarsystem.exercise1.solarsystem.DwarfPlanet;
import com.lauralone.solarsystem.exercise1.solarsystem.Planet;
import com.lauralone.solarsystem.exercise1.solarsystem.SolarSystemObject;
import com.lauralone.solarsystem.exercise1.solarsystem.Star;

import java.util.List;

public class SolarSystemDataViewer {
	
	public void viewDataOfObjects(String input) {
		
		SolarSystemDataParser solarSystemDataParser = new SolarSystemDataParser();
		List<SolarSystemObject> objectsOfSolarSystem = solarSystemDataParser.parseToObjectsByNameOrType(input);
		
		System.out.println("Results for: " + "\"" + input + "\"" + "\n-------------------------------------------");
		int resultCounter = 0;
		for (var object : objectsOfSolarSystem) {
			
			// every property that every subclass also has, could have been written right in the superclass^^ dry(!)
			
			String type = object.getType().toLowerCase();
			switch (type) {
				case "star" -> {
					Star star = (Star) object;
					System.out.println("Name: " + star.getName() + "\nType: " + star.getType() + "\nDiameter (Scale To Earth): " + star.getDiameterScaleToEarth() + "\nDiameter In Km: " + star.getDiameterInKm() + "\nMass (Scale To Earth): " + star.getMassScaleToEarth() + "\nDistance To Sun (In AU): " + star.getDistanceToSunInAU() + "\nConfirmed Moons: " + star.getConfirmedMoons() + "\nProvisional Moons: " + star.getProvisionalMoons() + "\nTotal Moons: " + star.getTotalMoons() + "\nTemperature At Surface (In Celsius): " + star.getTemperatureAtSurfaceInCelsius() + "\nGravity At Equator (Scale To Earth): " + star.getGravityAtEquatorScaleToEarth() + "\nHas Rings: " + star.getObjectHasRings() + "\nAtmospheric Composition: " + star.getAtmosphericComposition() + "\n-------------------------------------------");
					resultCounter++;
				}
				case "planet" -> {
					Planet planet = (Planet) object;
					System.out.println("Name: " + planet.getName() + "\nType: " + planet.getType() + "\nDiameter (Scale To Earth): " + planet.getDiameterScaleToEarth() + "\nDiameter In Km: " + planet.getDiameterInKm() + "\nMass (Scale To Earth): " + planet.getMassScaleToEarth() + "\nDistance To Sun (In AU): " + planet.getDistanceToSunInAU() + "\nConfirmed Moons: " + planet.getConfirmedMoons() + "\nProvisional Moons: " + planet.getProvisionalMoons() + "\nTotal Moons: " + planet.getTotalMoons() + "\nTemperature At Surface (In Celsius): " + planet.getTemperatureAtSurfaceInCelsius() + "\nGravity At Equator (Scale To Earth): " + planet.getGravityAtEquatorScaleToEarth() + "\nHas Rings: " + planet.getObjectHasRings() + "\nAtmospheric Composition: " + planet.getAtmosphericComposition() + "\n-------------------------------------------");
					resultCounter++;
				}
				case "dwarfplanet" -> {
					DwarfPlanet dwarf = (DwarfPlanet) object;
					System.out.println("Name: " + dwarf.getName() + "\nType: " + dwarf.getType() + "\nDiameter (Scale To Earth): " + dwarf.getDiameterScaleToEarth() + "\nDiameter In Km: " + dwarf.getDiameterInKm() + "\nMass (Scale To Earth): " + dwarf.getMassScaleToEarth() + "\nDistance To Sun (In AU): " + dwarf.getDistanceToSunInAU() + "\nConfirmed Moons: " + dwarf.getConfirmedMoons() + "\nProvisional Moons: " + dwarf.getProvisionalMoons() + "\nTotal Moons: " + dwarf.getTotalMoons() + "\nTemperature At Surface (In Celsius): " + dwarf.getTemperatureAtSurfaceInCelsius() + "\nGravity At Equator (Scale To Earth): " + dwarf.getGravityAtEquatorScaleToEarth() + "\nHas Rings: " + dwarf.getObjectHasRings() + "\nAtmospheric Composition: " + dwarf.getAtmosphericComposition() + "\n-------------------------------------------");
					resultCounter++;
				}
				default -> System.out.println("Object not found" + "\n-------------------------------------------");
			}
		}
		
		System.out.println("Number Of Results: " + resultCounter + "\n-------------------------------------------\n-------------------------------------------");
	}
}
