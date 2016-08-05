package DP1_5.Prototype;

//测试
public class Client
{
	private static Prototype prototype;
	
	public  static Prototype operation(Prototype example)
	{
		return (Prototype)example.clone();
	}
	
	public static void main(String[] args)
	{
		Prototype prototype = new ConcretePrototype();
		
		System.out.println(prototype.toString());
		
		System.out.println(Client.operation(prototype).toString());
	}
}
