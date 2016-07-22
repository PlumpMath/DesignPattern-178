package DP3_7.Mediator;

public class Client
{
	public static void main(String[] args)
	{
		//新建具体中介者
		ConcreteMediator mediator = new ConcreteMediator();
		
		//创建中介者对象的同事类对象
		mediator.createConcreteMediator();
		
		Colleague1 c1 = new Colleague1(mediator);
		Colleague2 c2 = new Colleague2(mediator);
		
		mediator.colleagueChanged(c1);
	}
}
