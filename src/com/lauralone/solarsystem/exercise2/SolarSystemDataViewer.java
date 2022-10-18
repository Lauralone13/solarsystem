package com.lauralone.solarsystem.exercise2;

import com.lauralone.solarsystem.exercise2.solarsystem.SolarSystemObject;

import java.util.ArrayList;
import java.util.List;

public class SolarSystemDataViewer {
	
	private final SolarSystemDataParser solarSystemDataParser = new SolarSystemDataParser();
	
	public void viewDataOfObjects(String input) {
		List<SolarSystemObject> objectsOfSolarSystem = solarSystemDataParser.parseToObjectsByNameOrType(input);
		int resultCounter = 0;
		System.out.println("Results for: " + "\"" + input + "\"" + "\n-------------------------------------------");
		for (var object : objectsOfSolarSystem) {
			String name = object.getName().toLowerCase();
			String type = object.getType().toLowerCase();
			input = input.toLowerCase();
			if (name.contains(input) || type.contains(input)) {
				System.out.println("\nName: " + object.getName() + "\nType: " + object.getType() + "\nDiameter (Scale To Earth): " + object.getDiameterScaleToEarth() + "\nDiameter In Km: " + object.getDiameterInKm() + "\nMass (Scale To Earth): " + object.getMassScaleToEarth() + "\nDistance To Sun (In AU): " + object.getDistanceToSunInAU() + "\nConfirmed Moons: " + object.getConfirmedMoons() + "\nProvisional Moons: " + object.getProvisionalMoons() + "\nTotal Moons: " + object.getTotalMoons() + "\nTemperature At Surface (In Celsius): " + object.getTemperatureAtSurfaceInCelsius() + "\nGravity At Equator (Scale To Earth): " + object.getGravityAtEquatorScaleToEarth() + "\nHas Rings: " + object.getObjectHasRings() + "\nAtmospheric Composition: " + object.getAtmosphericComposition() + "\n-------------------------------------------");
				resultCounter++;
			} else {
				System.out.println("Object not found" + "\n-------------------------------------------");
			}
		}
		
		System.out.println("Number of results with specific data: " + resultCounter + "\n-------------------------------------------");
		List<WordToKnow> wordsToKnowAboutObjects = solarSystemDataParser.getWordsToKnowAboutObjects(input);
		for (WordToKnow wordToKnow : wordsToKnowAboutObjects) {
			System.out.println(wordToKnow.getWord() + "\n" + wordToKnow.getDescription() + "\n-------------------------------------------");
		}
		
		System.out.println("-------------------------------------------\n");
	}
	
	public void getIndexOfAllValidWords() {
		List<WordToKnow> listOfWordsToKnow = solarSystemDataParser.parseToListOfWordsToKnow();
		System.out.println("\nIndex of all searchable words:");
		for (WordToKnow wordToKnow : listOfWordsToKnow) {
			String word = wordToKnow.getWord().replaceAll(":", "");
			System.out.println(word);
		}
		System.out.println("-------------------------------------------\n");
	}
	
	public List<String> getIndexOfAllValidWordsAsAList() {
		List<WordToKnow> listOfWordsToKnow = solarSystemDataParser.parseToListOfWordsToKnow();
		List<String> listOfValidWords = new ArrayList<>();
		for (WordToKnow wordToKnow : listOfWordsToKnow) {
			String word = wordToKnow.getWord().replaceAll(":", "");
			listOfValidWords.add(word);
		}
		
		return listOfValidWords;
	}
}
