package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propReader {
	String fileName = "/Volumes/Renuka/Professional Stuff (Restricted)/Session_material/Session_WorkSpaces/SA2508017_Workspace/WebDriver_Module/keywordDriverFramework/src/test/java/testData/OR.properties";

	Properties prop;

	public propReader() {
		try {
			setupPropertiesObject();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void setupPropertiesObject() throws IOException {
		File file = new File(fileName);
		FileInputStream fis = new FileInputStream(file); // checked exception.
		prop = new Properties();
		prop.load(fis);
	}

	public String getValue(String value) {
		return prop.getProperty(value);
	}
}
