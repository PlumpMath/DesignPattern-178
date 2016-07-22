package DP3_7.Mediator;

/**
 *	具体中介者角色 
 */
public class ConcreteMediator extends Mediator
{
	//具体中介者知道所有的具体同事类
	private Colleague1 colleague1;
	private Colleague2 colleague2;
	
	//事件方法的具体实现
	@Override
	public void colleagueChanged(Colleague c)
	{
		colleague1.action();
		colleague2.action();
	}
	
	//工厂方法,创建同事对象
	public void createConcreteMediator()
	{
		colleague1 = new Colleague1(this);
		colleague2 = new Colleague2(this);
	}
	
	//取值方法,提供同事对象 
	public Colleague1 getColleague1()
	{
		return colleague1;
	}
	
	//取值方法,提供同事对象 
	public Colleague2 getColleague2()
	{
		return colleague2;
	}
}
