package DP2_1.Adapter;

/**
 *	适配器角色 
 *	适配器将源接口转换成目标接口
 *
 *	类的适配器类继承源角色类来提供源角色类已有的方法,
 *	实现目标角色接口来添加目标角色有而源角色没有的方法.
 */
public class Adapter extends Adaptee implements Target
{
	//源角色也有的方法
	@Override
	public void sampleOperation1()
	{
		super.sampleOperation1();
	}
	
	/**
	 * 源类Adaptee没有此方法,由适配器类添加
	 */
	@Override
	public void sampleOperation2()
	{
		System.out.println("oper2...");
	}
}
