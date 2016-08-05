package DP1_6.Builder;

//测试
public class Client
{
	public static void main(String[] args)
	{
		//建造者对象
		Builder builder = new ConcreteBuilder();
		
		//导演者对象
		Director director = new Director(builder);
		director.construct();

		//产品类对象
		Product product = builder.retrieveResult();

		System.out.println(product.getPart1());
		System.out.println(product.getPart2());
	}
}