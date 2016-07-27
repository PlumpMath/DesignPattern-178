package DP2_5.FlyWeight;

//客户端
public class Client
{
	public static void main(String[] args)
	{
		//创建享元工厂对象
		FlyWeightFactory factory = new FlyWeightFactory();
		
		//向享元工厂对象请求一个内部状态为'a'的享元对象
		FlyWeight fly = factory.factory(new Character('a'));
		
		//以参数方式传入一个外部状态.
		fly.operation("First Call");
		
		//向享元对象请求一个内部状态为'b'的享元对象
		fly = factory.factory(new Character('b'));
		
		//以参数方式传入一个外部状态.
		fly.operation("Second Call");
		
		//向享元工厂对象请求一个内部状态为'a'的享元对象
		fly = factory.factory(new Character('a'));
		
		//以参数方式传入一个外部状态.
		fly.operation("Third Call");
		
		//打印所有的独立的享元对象.
		factory.checkFlyWeight();
	}
}
