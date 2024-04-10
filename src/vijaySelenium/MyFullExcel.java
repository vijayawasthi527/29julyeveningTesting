package vijaySelenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MyFullExcel {

	public static void main(String[] args) 
	{
		
	}
	
	public void myDataRead() throws EncryptedDocumentException, IOException
	{
		FileInputStream myFile=new FileInputStream("C:\\Users\\vijay\\Desktop\\File.xlsx");
		Workbook myWorkBook = WorkbookFactory.create(myFile);
		Sheet mySheet = myWorkBook.getSheet("Sheet1");
		
		int totalrow=mySheet.getLastRowNum();
		
		int Column=mySheet.getRow(0).getLastCellNum();
		int totalColumn=Column-1;
		
	}

}
