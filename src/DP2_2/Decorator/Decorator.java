package DP2_2.Decorator;

/**
 *	装饰角色 
 *
 *	装饰角色类实现组件接口,与具体组件类之间是聚合关系.
 */
public class Decorator implements Component
{
	private Component component;
	
	//装饰角色类和组件类之间是聚合关系
	//有参构造函数
	public Decorator(Component component)
	{
		this.component = component;
	}
	
	//无参构造函数
	public Decorator()
	{
	}
	
	//实现抽象组件的方法
	@Override
	public void sampleOperation()
	{
		component.sampleOperation();
	}
}
