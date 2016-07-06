package DP1_2.Factory_Method;

/**
 *	具体工厂类 
 */
public class AppleFactory implements FruitGardener
{
	/**
	 * 工厂方法
	 */
	@Override
	public Fruit factory()
	{
		// TODO Auto-generated method stub
		return new Apple();
	}
}
