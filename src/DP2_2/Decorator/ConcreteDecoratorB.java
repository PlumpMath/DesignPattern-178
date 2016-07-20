package DP2_2.Decorator;

/**
 *	具体装饰角色 
 */
public class ConcreteDecoratorB extends Decorator
{
	//与组件之间是聚合关系
	public ConcreteDecoratorB(Component component)
	{
		super(component);
	}
	
	@Override
	public void sampleOperation()
	{
		super.sampleOperation();
		
		System.out.println("给组件添加装饰B");
	}
}
