package misc;

import java.io.IOException;

public class CommonlyUsedMethodPropertyPractice {

	public static void main(String[] args) throws IOException
	{
		String value1=CommonlyUsedMethod.readDataFromPropertyFile("mobileNum");
		String value2=CommonlyUsedMethod.readDataFromPropertyFile("age");
		
		System.out.println("Mobile Number is-> "+value1+" "+"Age is-> "+value2);

	}

}
