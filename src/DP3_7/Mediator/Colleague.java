package DP3_7.Mediator;

/**
 *	抽象同事类 
 */
public abstract class Colleague
{
	private Mediator mediator;
	
	public Colleague(Mediator mediator)
	{
		this.mediator = mediator;
	}
	
	//取值方法,提供中介者对象
	public Mediator getMediator()
	{
		return mediator;
	}
	
	//行动方法,有子类实现
	public abstract void action();
	
	//示意性的商业方法,调用此方法可以改变对象的内部状态
	public void change()
	{
		mediator.colleagueChanged(this);
	}
}
