package DP3_3.Memento;

/**
 *	客户端角色 
 */
public class Client
{
	private static Originator o = new Originator();//发起人
	private static Caretaker c = new Caretaker();//负责人
	
	public static void main(String[] args)
	{
		//改变负责人的状态
		o.setState("on");
		System.out.println(o.getState());
		
		//创建备忘录对象，并将发起人对象的状态存储起来
		c.saveMemento(o.createMemento());
		
		//改变负责人的状态
		o.setState("off");
		
		System.out.println(o.getState());
		//恢复发起人对象的状态
		o.restoreMemento(c.retrieveMemento());
		System.out.println(o.getState());
	}
}
