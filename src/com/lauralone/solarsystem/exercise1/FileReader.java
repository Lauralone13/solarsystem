package com.lauralone.solarsystem.exercise1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
	
	public List<String> read(String file) {
		Path path = Path.of(file);
		try {
			return Files.readAllLines(path);
		} catch (IOException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
}
	
/*
==> The FileReader class has the read method that receives the content root path of a file and returns a List with all the lines of that file
-- We use the Path class to find the file
-- We use the Files class to readAllLines
-- We surround the readAllLines method with a try/catch to be able to recover in case something unexpected happens
-- As an example, we return an empty List if something goes wrong, since we promised to return a List in all cases
(In a real application, you should not disable error propagation in this way)

===================================================================
!!!
(Only with title visible) Now we will see how to write a service class that makes it even easier for us to read files

Code: What did we do here? Well, if you have a look at this part (from Path path to e.printStackTrace), you will see that this is nothing else what we did one slide before. But what changes is, that we return an empty list in case we have any problem finding or reading the file.

Remember, the content root path was the path to the specific file, for example the “src/io/everyoncodes/doc.txt” we had previously
(!) Remember, this is the first step
(!) And this is the second step
For example, the file we’re looking for is not there.
Remember, if we write List<String> we always have to return a list. Which makes sense in this case.

 */
