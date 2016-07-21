package DP3_6.Strategy;

public class Client
{
	public static void main(String[] args)
	{
		Context context = new Context();
		
		context.setStrategy(new ConcreteStrategy1());
		context.operation();
		
		context.setStrategy(new ConcreteStrategy2());
		context.operation();
	}
}
