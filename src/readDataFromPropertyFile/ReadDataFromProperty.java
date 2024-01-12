package readDataFromPropertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException 
	{
		//crete object of properties
		
		Properties prop=new Properties();
		
		//crete object of inputStream file
		
		FileInputStream myFile=new FileInputStream("C:\\Users\\vijay\\eclipse-workspace\\vijaySelenium\\CoverFoxData.properties");
		prop.load(myFile);
		
		String value=prop.getProperty("age");
		System.out.println(value);
	}

}
