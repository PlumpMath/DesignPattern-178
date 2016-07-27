package DP3_2.Iterator;

/**
 *	具体集合角色 
 */
public class ConcreteAggregate extends Aggregate
{
	private Object[] objs = {"Monk Tang" , 
			"Moneky" , "Pigsy",
			"Sandy" , "Horse"};
	
	/**
	 * 工厂方法，返回一个迭代子对象
	 */
	@Override
	public Iterator createIterator()
	{
		return new ConcreteIterator(this);
	}
	
	/**
	 *	取值方法：向外界提供集合元素
	 */
	public Object getElement(int index)
	{
		if(index < objs.length)
		{
			return objs[index];
		}
		else
		{
			return null;
		}
	}
	
	/**
	 *	取值方法：向外界提供集合大小 
	 */
	public int size()
	{
		return objs.length;
	}
}
