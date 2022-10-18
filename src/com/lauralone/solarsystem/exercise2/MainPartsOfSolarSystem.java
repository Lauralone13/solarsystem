package com.lauralone.solarsystem.exercise2;


import com.lauralone.solarsystem.exercise2.solarsystem.SolarSystemObject;

import java.util.ArrayList;
import java.util.List;

public class MainPartsOfSolarSystem {
	
	public void getMainParts() {
		
		SolarSystemDataParser solarSystemDataParser = new SolarSystemDataParser();
		List<SolarSystemObject> eightPlanets = solarSystemDataParser.parseToObjectsByNameOrType("planet");
		List<SolarSystemObject> star = solarSystemDataParser.parseToObjectsByNameOrType("sun");
		
		List<SolarSystemObject> mainPartsOfSolarSystem = new ArrayList<>(star);
		mainPartsOfSolarSystem.addAll(eightPlanets);
		int objectCounter = 1;
		for (SolarSystemObject object : mainPartsOfSolarSystem) {
			System.out.println(objectCounter + ". " + object.getType() + " - " + object.getName());
			objectCounter++;
		}
	}
}
