package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream myFile=new FileInputStream("C:\\Users\\vijay\\Desktop\\Class Notes\\Practice Work\\NewExcelFileForTesting.xlsx");
		
		Workbook myWorkBook=WorkbookFactory.create(myFile);
		
		Sheet mySheet = myWorkBook.getSheet("Sheet1");
		
		//read Whole ExcelSheet
		
		//outer for loop --> row 0--->2
		for(int i=0;i<=2;i++)
		{
			//inner for loop--> cells 0-->3
			for(int j=0;j<=3;j++)
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+"   ");
			}
			System.out.println();
		}
		
		
		
	}

}
