package com.lauralone.solarsystem.exercise1.application;

import com.lauralone.solarsystem.exercise1.SolarSystemDataViewer;

// developed by LauraLone13 (June 2022)

public class Application {
	public static void main(String[] args) {
		
		SolarSystemDataViewer solarSystemDataViewer = new SolarSystemDataViewer();
		
		solarSystemDataViewer.viewDataOfObjects("pla");
		System.out.println();
		solarSystemDataViewer.viewDataOfObjects("planet");
		System.out.println();
		solarSystemDataViewer.viewDataOfObjects("dwarf");
		System.out.println();
		solarSystemDataViewer.viewDataOfObjects("dwarfplanet");
		System.out.println();
		solarSystemDataViewer.viewDataOfObjects("dwarf planet");
		System.out.println(); // Number Of Results: 0
		solarSystemDataViewer.viewDataOfObjects("sta");
		System.out.println();
		solarSystemDataViewer.viewDataOfObjects("su");
		
	}
}

