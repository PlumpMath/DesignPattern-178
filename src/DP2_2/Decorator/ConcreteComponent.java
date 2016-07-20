package DP2_2.Decorator;

/**
 *	具体构件角色 
 *	可以给具体组件上添加各种装饰
 */
public class ConcreteComponent implements Component
{	
	@Override
	public void sampleOperation()
	{
		System.out.println("具体组件");
	}
}
