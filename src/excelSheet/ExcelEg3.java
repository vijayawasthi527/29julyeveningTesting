package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream myFile=new FileInputStream("C:\\\\Users\\\\vijay\\\\Desktop\\\\Class Notes\\\\Practice Work\\\\NewExcelFileForTesting.xlsx");

		Workbook myWorkBook=WorkbookFactory.create(myFile);
		
		Sheet mySheet=myWorkBook.getSheet("Sheet1");
		
		
		//now we will read the whole row
			
		for(int i=0;i<=3;i++)
		{
			String value = mySheet.getRow(0).getCell(i).getStringCellValue();
			System.out.print(value+" ");
		}
		 System.out.println();
		 
		 System.out.println("==========================================================");
		 
		 //now we are readind data from whole column (cell)
		 
		 for(int i=0;i<=2;i++)
		 {
			 String cellValue = mySheet.getRow(i).getCell(1).getStringCellValue();
			 System.out.print(cellValue+" ");
		 }
		 System.out.println();
	
	
	}

}
