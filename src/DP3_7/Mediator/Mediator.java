package DP3_7.Mediator;

/**
 *	抽象中介者角色 
 */
public abstract class Mediator
{
	//事件方法,由子类实现
	public abstract void colleagueChanged(Colleague c);
}
