package DP3_3.Memento;

/**
 *	发起人角色 
 *  发起人角色利用一个新创建的备忘录对象将自己内部状态存储起来
 */
public class Originator
{
	private String state;
	
	/**
	 *	工厂方法 , 返回一个新的备忘录对象 
	 */
	public Memento createMemento()
	{
		//由发起人新建备忘录对象，并将自己的状态存储在备忘录对象中
		return new Memento(state);
	}
	
	/**
	 *	将发起人恢复到备忘录对象所记载的状态 
	 */
	public void restoreMemento(Memento memento)
	{
		this.state = memento.getState();
	}
	
	/**
	 *	状态的取值方法 
	 */
	public String getState()
	{
		return this.state;
	}
	
	/**
	 *	状态的赋值方法 
	 *	设定发起人对象的内部状态
	 */
	public void setState(String state)
	{
		this.state = state;
		System.out.println("CurrentState = " + this.state);
	}
	
	
}
