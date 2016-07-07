package DP2_7.Bridge;

public class Client
{
	public static void main(String[] args)
	{
		Abstraction abstraction = new RefinedAbstraction();
		
		abstraction.operation(new ConcreteImplementorA());
		abstraction.operation(new ConcreteImplementorB());
	}
}
