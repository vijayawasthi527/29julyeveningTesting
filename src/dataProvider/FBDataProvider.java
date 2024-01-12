package dataProvider;

import org.testng.annotations.DataProvider;


public class FBDataProvider
{
	@DataProvider(name="FBregression")
	public static String[][] fbDataSet()
	{
		String data[][]= {{"vijay","awasthi","98982312345"},{"rahul","Sharma","9878900001"},{"Sundar","joshi","7787912678"}};
		return data;
	}
	
	@DataProvider(name="FBSanity")
	public static String[][] fbDataSet1()
	{
		String data[][]= {{"ABC","XYX","9981898909"},{"hjk","uuiu","7788990011"},{"try","rtx","0011223456"}};
		return data;
	}
   
  }

