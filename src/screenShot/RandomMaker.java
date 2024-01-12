package screenShot;


import net.bytebuddy.utility.RandomString;

public class RandomMaker {

	public static void main(String[] args) 
	{
		String s=RandomString.make(3);
		//Date d=new Date();
		
		System.out.println(s);
		
	}

}
