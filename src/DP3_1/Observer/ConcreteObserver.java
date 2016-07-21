package DP3_1.Observer;

/**
 *	具体观察者角色. 
 */
public class ConcreteObserver implements Observer
{
	/**
	 *	调用这个方法会更新自己. 
	 */
	@Override
	public void update()
	{
		System.out.println("I'm notified!");
	}
}
