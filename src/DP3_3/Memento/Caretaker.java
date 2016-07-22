package DP3_3.Memento;

/**
 *	负责人角色 
 *	负责人角色负责保存备忘录对象，但从不修改(甚至不查看)备忘录对象的内容
 */
public class Caretaker
{
	//负责人持有备忘录对象的引用.
	private Memento memento;
	
	/**
	 *	备忘录的取值方法 
	 */
	public Memento retrieveMemento()
	{
		return this.memento;
	}
	
	/**
	 *	备忘录的赋值方法 
	 */
	public void saveMemento(Memento memento)
	{
		this.memento = memento;
	}
}
