package DP3_2.Iterator;

/**
 *	具体迭代子角色 
 */
public class ConcreteIterator implements Iterator
{
	private ConcreteAggregate agg;
	private int index = 0;
	private int size = 0;
	/**
	 * 构造函数
	 */
	public ConcreteIterator(ConcreteAggregate agg)
	{
		this.agg = agg;
		size = agg.size();
		index = 0;
	}
	
	/**
	 *	迭代方法 ， 返回到第一个元素 
	 */
	@Override
	public void first()
	{
		index = 0;
	}
	
	/**
	 *	迭代方法 ， 移动到下一个元素 
	 */
	@Override
	public void next()
	{
		if(index < size)
		{
			index++;
		}
	}
	
	/**
	 *	迭代方法 ，是否是最后一个元素 
	 */
	@Override
	public boolean isDone()
	{
		return (index >= size);
	}
	
	/**
	 *	迭代方法 ， 返回当前元素
	 */
	@Override
	public Object currentItem()
	{
		return agg.getElement(index);
	}
}
