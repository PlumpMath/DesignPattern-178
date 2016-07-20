package DP2_2.Decorator;

public class mytest
{
	private final static Component c = new ConcreteComponent();//没有装饰的组件
	
	private final static Component d = new ConcreteDecoratorA(c);//添加了一个装饰A的组件
	
	private final static Component e = new ConcreteDecoratorB(d);//添加了装饰A和装饰B的组件
	
	public static void main(String[] args)
	{
		c.sampleOperation();
		
		System.out.println("---------------------");
		
		d.sampleOperation();
		
		System.out.println("---------------------");
		
		e.sampleOperation();
		
		System.out.println("---------------------");
		
		Component f = new ConcreteDecoratorB(new ConcreteDecoratorA(new ConcreteComponent()));
		
		f.sampleOperation();
		
		System.out.println("---------------------");
	}
}
