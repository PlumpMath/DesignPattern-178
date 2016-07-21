package DP3_1.Observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *	具体主题角色. 
 */
public class ConcreteSubject implements Subject
{
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	/**
	 *	调用这个方法登记一个新的观察者对象
	 */
	@Override
	public void attach(Observer observer)
	{
		observers.add(observer);
	}
	
	/**
	 *	调用这个方法删除一个已登记的观察者对象 
	 */
	@Override
	public void detach(Observer observer)
	{
		observers.remove(observer);
	}
	
	/**
	 *	调用这个方法通知所有已登记的观察者. 
	 */
	@Override
	public void notifyObservers()
	{
		Iterator<Observer> iterator = observers.iterator();
		
		while(iterator.hasNext())
		{
			iterator.next().update();
		}
		
	}
}
