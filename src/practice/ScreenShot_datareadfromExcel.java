package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_datareadfromExcel {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String timeStamp=new SimpleDateFormat("dd.MM.yyyy.HH.mm.ss").format(new Date());
		File myfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File newscreenshot=new File("C:\\Users\\vijay\\Desktop\\Class Notes\\"+timeStamp+".png");
		
		FileHandler.copy(myfile, newscreenshot);
		System.out.println("Screenshot Taken");
		
		
		
		
		String mydate=new SimpleDateFormat("dd.MM.yyyy.HH.mm.ss").format(new Date());

		
	}
	public String readData(int row,int cell) throws EncryptedDocumentException, IOException
	{
FileInputStream mydatafile=new FileInputStream(System.getProperty("user.dir")+"\\newfile.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(mydatafile).getSheet("Sheet3");
		String requiredData=mysheet.getRow(row).getCell(cell).getStringCellValue();
		
		return requiredData;
	}

}
