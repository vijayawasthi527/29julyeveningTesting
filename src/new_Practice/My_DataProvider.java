package new_Practice;

import org.testng.annotations.DataProvider;

public class My_DataProvider 
{
	@DataProvider(name="FbSanity")
	public static String[][] fbDataSet()
	{
		String data[][]= {{"vijay","awasthi","98982312345"},{"rahul","Sharma","9878900001"},{"Sundar","joshi","7787912678"}};
		return data;
	}
	
	@DataProvider(name="fbRegression")
	public static String[][] fbDataset1()
	{
		String data[][]= {{"Hello","kumar","9090909090"},{"kk","iop","787878787878"},{"opop","uiui","7873434343434"}};
		return data;
	}

	

}
