package DP1_2.Factory_Method;

public class test
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		AppleFactory applefactory = new AppleFactory();
		
		Fruit f = applefactory.factory();
		
		f.grow();
	}

}
