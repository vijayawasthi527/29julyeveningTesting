package practiceOfExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CompleteDataFromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream myFile=new FileInputStream("C:\\Users\\vijay\\Desktop\\Class Notes\\Practice Work\\NewExcelFileForTesting.xlsx");
		Workbook myWorkBook = WorkbookFactory.create(myFile);
		Sheet mySheet = myWorkBook.getSheet("Sheet3");
		
		int rows=mySheet.getLastRowNum();
		int totalNumRows=rows;
		
		Short cells=mySheet.getRow(0).getLastCellNum();
		int totalNumColums=cells-1;
		
		for(int i=0;i<=totalNumRows;i++)
		{
			for(int j=0;j<=totalNumColums;j++)
			{
				CellType celldataType = mySheet.getRow(i).getCell(j).getCellType();
				
				if(celldataType==CellType.NUMERIC)
				{
					double value = mySheet.getRow(i).getCell(j).getNumericCellValue();
					System.out.print(value+"  ");
				}
				else if(celldataType==CellType.STRING)
				{
					String value = mySheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(value+"   ");
				}
				else if(celldataType==CellType.BOOLEAN)
				{
					boolean value = mySheet.getRow(i).getCell(j).getBooleanCellValue();
					System.out.print(value+"  ");
				}
			}
			System.out.println();
		}
		
		
	}

}
