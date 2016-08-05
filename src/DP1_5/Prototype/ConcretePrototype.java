package DP1_5.Prototype;

/**
 *	具体原型类 
 */
public class ConcretePrototype implements Prototype
{
	@Override
	public Object clone() 
	{
		try
		{
			return super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			return null;
		}
	}
}
