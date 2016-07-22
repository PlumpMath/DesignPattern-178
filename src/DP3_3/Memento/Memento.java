package DP3_3.Memento;

/**
 *	备忘录角色 
 *	备忘录对象将发起人对象传入的状态存储起来
 */
public class Memento
{
	private String state;
	
	public Memento(String state)
	{
		this.state = state;
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
	 */
	public void setState(String state)
	{
		this.state = state;
	}
}
