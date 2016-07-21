package DP3_1.Observer;

/**
 *	抽象主题角色 
 */
public interface Subject
{
	/**
	 *	调用这个方法登记一个新的观察者对象
	 */
	public void attach(Observer observer);
	
	/**
	 *	调用这个方法删除一个已登记的观察者对象 
	 */
	public void detach(Observer observer);
	
	/**
	 *	调用这个方法通知所有已登记的观察者. 
	 */
	public void notifyObservers();
	
}
