package DP1_1.SimpleFactory;

public class FruitGardener
{
	/**
	 * 工厂类      静态工厂方法
	 */
	public static Fruit factory(String which) throws BadFruitException
	{
		if(which.equalsIgnoreCase("apple"))
		{
			return new Apple();
		}
		else if(which.equalsIgnoreCase("grape"))
		{
			return new Grape();
		}
		else if(which.equalsIgnoreCase("strawberry"))
		{
			return new StrawBerry();
		}
		else
		{
			throw new BadFruitException("Bad fruit request");
		}
	}
}
