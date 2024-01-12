package misc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonlyUsedMethod 
{
	//Reading_Data_from_Excel
	//Taking_ScreenShot
	//ScrollIntoView
	//Waiting
	
	public static void takeScreenshot(WebDriver driver,String myimage) throws IOException 
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\vijay\\Desktop\\Class Notes\\Practice Work\\"+myimage+".png");
		
		FileHandler.copy(src, dest);
	}
	
	public static void implicitWait(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	public static void ScrollIntoView(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		implicitWait(driver,5);
		js.executeScript("arguments[0].scrollIntoView();",element);
	}
	
	
	public static String readmyDataFromExcel(int row, int cell) throws
	EncryptedDocumentException, IOException,FileNotFoundException
	{
	FileInputStream myFile= new FileInputStream("C:\\Users\\vijay\\Desktop\\Class Notes\\Practice Work\\NewExcelFileForTesting.xlsx");

	Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet5");
	String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
	return value;
	
	}
	
	//read data from property file
	public static String readDataFromPropertyFile(String key) throws IOException
	{
		//crete object of properties class
		Properties prop=new Properties();
		
		//file location
		
		FileInputStream myFile=new FileInputStream("C:\\Users\\vijay\\eclipse-workspace\\vijaySelenium\\CoverFoxData.properties");
		
		//load file
		
		prop.load(myFile);
		
		//pass the key for the data we want
		
		String value=prop.getProperty(key);
		return value;
	}
	 
}
