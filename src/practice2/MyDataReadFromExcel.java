package practice2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MyDataReadFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream myFile=new FileInputStream("C:\\Users\\vijay\\Desktop\\Class Notes\\Practice Work\\NewExcelFileForTesting.xlsx");
		Workbook myWORKBOOK = WorkbookFactory.create(myFile);
		Sheet mySheet = myWORKBOOK.getSheet("Sheet2");
		int rows=mySheet.getLastRowNum();
		int totalNumerOfRows=rows;
		
		Short columns=mySheet.getRow(0).getLastCellNum();
		int totalNumberOfColumns=columns-1;
		
		for(int i=0;i<=totalNumerOfRows;i++)
		{
			for(int j=0;j<=totalNumberOfColumns;j++)
			{
				CellType dataType = mySheet.getRow(i).getCell(j).getCellType();
				
				if(dataType==CellType.STRING)
				{
					String value = mySheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(value+"    ");
				}
				else if(dataType==CellType.NUMERIC)
				{
					double value=mySheet.getRow(i).getCell(j).getNumericCellValue();
					System.out.print(value+"    ");
				}
				
				else if(dataType==CellType.BOOLEAN)
				{
					boolean value = mySheet.getRow(i).getCell(j).getBooleanCellValue();
					System.out.print(value+"   ");
				}
			}
			System.out.println();
		}
	}

}
