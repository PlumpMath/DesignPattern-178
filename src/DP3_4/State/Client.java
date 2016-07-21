package DP3_4.State;

public class Client
{
	public static void main(String[] args)
	{
		Context context = new Context();//环境类
		
		ConcreteState1 state1 = new ConcreteState1();//具体状态1
		ConcreteState2 state2 = new ConcreteState2();//具体状态2
		ConcreteState3 state3 = new ConcreteState3();//具体状态3
		
		context.setState(state1);//设定环境状态
		context.operation();
		
		System.out.println("------------------------------");

		context.setState(state2);//设定环境状态
		context.operation();
		
		System.out.println("------------------------------");
		
		context.setState(state3);//设定环境状态
		context.operation();
		
		System.out.println("------------------------------");
	}
}
