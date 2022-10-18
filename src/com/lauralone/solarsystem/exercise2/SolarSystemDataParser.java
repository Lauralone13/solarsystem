package com.lauralone.solarsystem.exercise2;

import com.lauralone.solarsystem.exercise1.FileReader;
import com.lauralone.solarsystem.exercise2.solarsystem.SolarSystemObject;

import java.util.ArrayList;
import java.util.List;


public class SolarSystemDataParser {
	
	private final FileReader fileReader = new FileReader();
	
	//Words & Descriptions
	public List<WordToKnow> parseToListOfWordsToKnow() {
		String fileWordsToKnow = "src/com/lauralone/solarsystem/files/wordstoknow_solarsystem.txt";
		List<String> listOfElements = fileReader.read(fileWordsToKnow);
		List<WordToKnow> listOfWordsToKnow = new ArrayList<>();
		String word = "";
		String description = "";
		int counter = 0;
		for (String element : listOfElements) {
			if (element.isEmpty()) {
				continue;
			}
			if (element.contains(":")) {
				if (counter > 0) {
					description = description.replaceAll("\\. ", "\\.").replaceAll("\\.", ".\n");
					listOfWordsToKnow.add(new WordToKnow(word, description));
				}
				word = element;
				description = "";
				continue;
			}
			description = description + element;
			counter++;
		}
		
		return listOfWordsToKnow;
	}
	
	public List<WordToKnow> getWordsToKnowAboutObjects(String searchedWord) {
		
		List<WordToKnow> indexOfValidWords = new ArrayList<>();
		
		List<WordToKnow> listOfWordsToKnow = parseToListOfWordsToKnow();
		
		for (WordToKnow wordToKnow : listOfWordsToKnow) {
			String name = wordToKnow.getWord().replaceAll(":", "");
			if (name.toLowerCase().contains(searchedWord.toLowerCase())) {
				indexOfValidWords.add(wordToKnow);
			}
		}
		
		return indexOfValidWords;
	}
	
	
	// solar system objects - Data-Details
	
	private List<List<String>> parseDataToListOfStringElements() {
		String file = "src/com/lauralone/solarsystem/files/solarsystem_objects_datalist.txt";
		List<String> objectDataStringsRaw = fileReader.read(file);
		
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
		List<List<String>> listOfObjectElements = parseDataToListOfStringElements();
		
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
				
				SolarSystemObject object = new SolarSystemObject(name, type, diameterScaleToEarth, diameterInKm, massScaleToEarth, distanceToSunInAU, confirmedMoons, provisionalMoons, totalMoons, temperatureAtSurfaceInCelsius, gravityAtEquatorScaleToEarth, objectHasRings, atmosphericComposition);
				searchedObjectsByInput.add(object);
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
