package vijaySelenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MyExcelSheet {

	String mydata;
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{	
		
		MyExcelSheet h=new MyExcelSheet();
		h.getData(0,5);
		
	}
	
	
	public String getData(int row,int cell)throws EncryptedDocumentException, IOException
	{
       FileInputStream myfile=new FileInputStream("C:\\Users\\vijay\\Desktop\\File.xlsx");
		
		Workbook myWorkBook = WorkbookFactory.create(myfile);
		try
		{
		 mydata = myWorkBook.getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
		}
		
		catch (NullPointerException e)
		{
			System.out.println("Please provide valid row and cell value");
		}
	
//		String mydata=mySheet.getRow(0).getCell(0).getStringCellValue();
//		
		System.out.println(mydata);
		
		return mydata;
	}

}
