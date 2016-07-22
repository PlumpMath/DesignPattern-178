package DP3_7.Mediator;

/**
 *	具体同事类 
 *	每一个同事对象都仅知道中介者,而不知道其他的同事对象
 */
public class Colleague1 extends Colleague
{
	//每个同事类对象都有中介者对象的引用
	public Colleague1(Mediator mediator)
	{
		super(mediator);
	}
	
	//行动方法的具体实现
	@Override
	public void action()
	{
		System.out.println("action from colleague1");
	}
}
