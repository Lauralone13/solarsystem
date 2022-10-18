package com.lauralone.solarsystem.exercise2;

import java.util.List;
import java.util.Scanner;

public class SolarSystemResearcher {
	
	public void searchForInformation() {
		SolarSystemDataViewer solarSystemDataViewer = new SolarSystemDataViewer();
		Scanner scanner = new Scanner(System.in);
		List<String> listOfValidWords = solarSystemDataViewer.getIndexOfAllValidWordsAsAList();
		
		while (true) {
			System.out.println("Search for:");
			String input = scanner.nextLine();
			
			if (input.equalsIgnoreCase("stop")) {
				System.out.println("\nGoodbye, see you! :)\n");
				MainPartsOfSolarSystem mainPartsOfSolarSystem = new MainPartsOfSolarSystem();
				System.out.println("Main parts of solar system:");
				mainPartsOfSolarSystem.getMainParts();
				break;
			}
			
			boolean isPresentInIndex = false;
			
			if (input.length() > 1) {
				
				if (input.equalsIgnoreCase("index")) {
					solarSystemDataViewer.getIndexOfAllValidWords();
					continue;
				}
				
				for (String word : listOfValidWords) {
					if (word.toLowerCase().contains(input.toLowerCase())) {
						isPresentInIndex = true;
						break;
					}
				}
				
				if (isPresentInIndex) {
					solarSystemDataViewer.viewDataOfObjects(input);
				} else {
					System.out.println("Word not found in index. Check index?");
					String checkIndex = scanner.nextLine();
					while (true) {
						if (checkIndex.equals("yes") || checkIndex.equals("true")) {
							solarSystemDataViewer.getIndexOfAllValidWords();
							break;
						}
						if (checkIndex.equals("no") || checkIndex.equals("false")) {
							break;
						} else {
							System.out.println("Please enter 'yes'/'true' or 'no'/'false'.");
							checkIndex = scanner.nextLine();
						}
					}
				}
			} else {
				System.out.println("Input too short. Please try again.");
			}
		}
	}
}
