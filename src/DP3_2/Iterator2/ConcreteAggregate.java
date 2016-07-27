package DP3_2.Iterator2;

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
		return new ConcreteIterator();
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
	
	/**
	 *	内部类	具体迭代子角色 
	 */
	private class ConcreteIterator implements Iterator
	{
		private int currentIndex = 0;
		/**
		 *	迭代方法 ， 返回到第一个元素 
		 */
		@Override
		public void first()
		{
			currentIndex = 0;
		}
		
		/**
		 *	迭代方法 ， 移动到下一个元素 
		 */
		@Override
		public void next()
		{
			if(currentIndex < objs.length)
			{
				currentIndex++;
			}
		}
		
		/**
		 *	迭代方法 ，是否是最后一个元素 
		 */
		@Override
		public boolean isDone()
		{
			return (currentIndex == objs.length);
		}
		
		/**
		 *	迭代方法 ， 返回当前元素
		 */
		@Override
		public Object currentItem()
		{
			return objs[currentIndex];
		}
	}
}
