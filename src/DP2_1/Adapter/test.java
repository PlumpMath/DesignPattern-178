package DP2_1.Adapter;

public class test
{
	private final static Target tar = new Adapter();
	
	public static void main(String[] args)
	{
		tar.sampleOperation1();
		tar.sampleOperation2();
	}

}
