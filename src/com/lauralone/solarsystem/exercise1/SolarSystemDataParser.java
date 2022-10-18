package com.lauralone.solarsystem.exercise1;

import com.lauralone.solarsystem.exercise1.solarsystem.DwarfPlanet;
import com.lauralone.solarsystem.exercise1.solarsystem.Planet;
import com.lauralone.solarsystem.exercise1.solarsystem.SolarSystemObject;
import com.lauralone.solarsystem.exercise1.solarsystem.Star;

import java.util.ArrayList;
import java.util.List;

public class SolarSystemDataParser {
	
	private final String file = "src/com/lauralone/solarsystem/files/solarsystem_objects_datalist.txt";
	private final FileReader fileReader = new FileReader();
	private final List<String> objectDataStringsRaw = fileReader.read(file);
	
	private List<List<String>> parseDataToListOfObjectElements() {
		List<List<String>> dataElementsOfObjectsAsStrings = new ArrayList<>();
		for (int i = 1; i < objectDataStringsRaw.size() - 5; i++) {
			String dataElementsOfSingleObjectAsString = objectDataStringsRaw.get(i);
			List<String> dataElementsOfObject = List.of(dataElementsOfSingleObjectAsString.split(";"));
			dataElementsOfObjectsAsStrings.add(dataElementsOfObject);
		}
		
		return dataElementsOfObjectsAsStrings;
	}
	
	public List<SolarSystemObject> parseToObjectsByNameOrType(String objectNameOrType) {
		List<SolarSystemObject> searchedObjectsByInput = new ArrayList<>();
		List<List<String>> listOfObjectElements = parseDataToListOfObjectElements();
		
		if (objectNameOrType.isEmpty()) {
			return List.of();
		}
		
		for (List<String> elementsOfSingleObject : listOfObjectElements) {
			String name = elementsOfSingleObject.get(0);
			String type = elementsOfSingleObject.get(1);
			
			if (name.toLowerCase().contains(objectNameOrType.toLowerCase()) || type.equalsIgnoreCase(objectNameOrType.toLowerCase()) || type.startsWith(objectNameOrType.toLowerCase())) {
				String diameterScaleToEarthString = elementsOfSingleObject.get(2);
				String diameterInKmString = elementsOfSingleObject.get(3);
				String massScaleToEarthString = elementsOfSingleObject.get(4);
				String distanceToSunInAUString = elementsOfSingleObject.get(5);
				String confirmedMoonsString = elementsOfSingleObject.get(6);
				String provisionalMoonsString = elementsOfSingleObject.get(7);
				String totalMoonsString = elementsOfSingleObject.get(8);
				String temperatureAtSurfaceInCelsius = elementsOfSingleObject.get(9);
				String gravityAtEquatorScaleToEarthString = elementsOfSingleObject.get(10);
				String objectHasRings = elementsOfSingleObject.get(11);
				String atmosphericComposition = elementsOfSingleObject.get(12);
				
				List<String> doubleStrings = List.of(diameterScaleToEarthString, massScaleToEarthString, distanceToSunInAUString, gravityAtEquatorScaleToEarthString);
				List<Double> listOfDoubles = new ArrayList<>();
				for (String doubleAsString : doubleStrings) {
					double newDouble = parseStringToDouble(doubleAsString);
					listOfDoubles.add(newDouble);
				}
				
				double diameterScaleToEarth = listOfDoubles.get(0);
				double massScaleToEarth = listOfDoubles.get(1);
				double distanceToSunInAU = listOfDoubles.get(2);
				double gravityAtEquatorScaleToEarth = listOfDoubles.get(3);
				
				List<String> integerStrings = List.of(diameterInKmString, confirmedMoonsString, provisionalMoonsString, totalMoonsString);
				List<Integer> listOfIntegers = new ArrayList<>();
				for (String integerAsString : integerStrings) {
					int newInteger = parseStringToInteger(integerAsString);
					listOfIntegers.add(newInteger);
				}
				
				int diameterInKm = listOfIntegers.get(0);
				int confirmedMoons = listOfIntegers.get(1);
				int provisionalMoons = listOfIntegers.get(2);
				int totalMoons = listOfIntegers.get(3);
				
				if (type.equalsIgnoreCase("Star")) {
					SolarSystemObject star = new Star(diameterScaleToEarth, diameterInKm, massScaleToEarth, distanceToSunInAU, confirmedMoons, provisionalMoons, totalMoons, temperatureAtSurfaceInCelsius, gravityAtEquatorScaleToEarth, objectHasRings, atmosphericComposition);
					searchedObjectsByInput.add(star);
				} else if (type.equalsIgnoreCase("Planet")) {
					SolarSystemObject planet = new Planet(name, diameterScaleToEarth, diameterInKm, massScaleToEarth, distanceToSunInAU, confirmedMoons, provisionalMoons, totalMoons, temperatureAtSurfaceInCelsius, gravityAtEquatorScaleToEarth, objectHasRings, atmosphericComposition);
					searchedObjectsByInput.add(planet);
				} else if (type.equalsIgnoreCase("DwarfPlanet")) {
					SolarSystemObject dwarfPlanet = new DwarfPlanet(name, diameterScaleToEarth, diameterInKm, massScaleToEarth, distanceToSunInAU, confirmedMoons, provisionalMoons, totalMoons, temperatureAtSurfaceInCelsius, gravityAtEquatorScaleToEarth, objectHasRings, atmosphericComposition);
					searchedObjectsByInput.add(dwarfPlanet);
				}
				
			}
		}
		
		return searchedObjectsByInput;
	}
	
	private double parseStringToDouble(String doubleAsString) {
		double newDouble = 0.0;
		try {
			newDouble = Double.parseDouble(doubleAsString);
		} catch (NumberFormatException e) {
			//do nothing
			System.out.println("failed parsing to double");
		}
		
		return newDouble;
	}
	
	private int parseStringToInteger(String integerAsString) {
		int newInteger = 0;
		try {
			newInteger = Integer.parseInt(integerAsString);
		} catch (NumberFormatException e) {
			//do nothing
			System.out.println("failed parsing to int");
		}
		
		return newInteger;
	}
}
