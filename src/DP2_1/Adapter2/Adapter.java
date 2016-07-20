package DP2_1.Adapter2;

/**
 *	适配器角色 
 */
public class Adapter implements Target
{
	private Adaptee adaptee;//源角色类
	
	//适配器类和源角色类之间是聚合关系.
	public Adapter(Adaptee adaptee)
	{
		this.adaptee = adaptee;
	}
	
	//源类也有的方法sampleOperation1
	@Override
	public void sampleOperation1()
	{
		adaptee.sampleOperation1();
	}
	
	//源类没有的方法,由适配器类来补充此方法
	@Override
	public void sampleOperation2()
	{
		System.out.println("适配器类增补方法sampleOperation2.");
	}
}
