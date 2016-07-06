package DP1_3.AbstractFactory;

/**
 *	具体工厂类  生产热带水果、蔬菜
 */
public class TropicalGardener implements Gardener
{
	/**
	 * 水果的工厂方法
	 */
	public Fruit createFruit(String name)
	{
		return new TropicalFruit(name);
	}
	
	/**
	 * 蔬菜的工厂方法
	 */
	public Veggie createVeggie(String name)
	{
		return new TropicalVeggie(name);
	}
}
