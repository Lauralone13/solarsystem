package com.lauralone.solarsystem.exercise1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class FileReaderTest {
	
	FileReader reader = new FileReader();
	String contentRootPath = "src/com/lauralone/solarsystem/files/document.txt";
	
	@Test
	void read() {
		List<String> result = reader.read(contentRootPath);
		List<String> expected = List.of("line 1;part 1-2", "line 2;part 2-2", "line 3;part 3-2");
		Assertions.assertEquals(expected, result);
	}
	
	@Test
	void readEmpty() {
		List<String> result = reader.read("src/com/lauralone/solarsystem/files/doc.txt");
		Assertions.assertTrue(result.isEmpty());
	}
}