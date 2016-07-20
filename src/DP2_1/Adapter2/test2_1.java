package DP2_1.Adapter2;

public class test2_1
{
	public static void main(String[] args)
	{
		Target target = new Adapter(new Adaptee());
		
		target.sampleOperation1();
		target.sampleOperation2();
	}
}
