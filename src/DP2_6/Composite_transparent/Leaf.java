package DP2_6.Composite_transparent;

import java.util.Iterator;

/**
 *	树叶构件角色
 *	树叶构件角色也实现了抽象构件角色所声明的各个方法,包括管理集合的方法
 *	但是树叶构件因为没有子结点,因此并没有集合可以用来管理.
 */
public class Leaf implements Component
{
	@Override
	public Component getComponent()
	{
		return this;
	}
	
	@Override
	public void sampleOperation()
	{
		System.out.println("Leaf operation");
	}
	
	@Override
	public void add(Component component)
	{
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void remove(Component component)
	{
		// TODO Auto-generated method stub
		
	}
}
