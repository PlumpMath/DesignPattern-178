package DP1_1.SimpleFactory;

public class test
{
	public static void main(String[] args)
	{
		try
		{
			FruitGardener.factory("apple").grow();;
			FruitGardener.factory("grape");
			FruitGardener.factory("strawberry");
			//FruitGardener.factory("banana");
		} catch (BadFruitException e)
		{
			e.printStackTrace();
		}
	}

}
