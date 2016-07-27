package DP3_2.Iterator2;

/**
 *	抽象集合角色 
 */
public abstract class Aggregate
{
	/**
	 * 工厂方法，返回一个迭代子对象
	 */
	public abstract Iterator createIterator();
}
