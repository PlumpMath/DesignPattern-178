package DP2_5.FlyWeight;

//具体享元角色
public class ConcreteFlyWeight extends FlyWeight
{
	private Character intrinsicState = null;

	//构造函数,内部状态作为参数传入.
	public ConcreteFlyWeight(Character state)
	{
		this.intrinsicState = state;
	}
	
	/**
	 * 外部状态作为参数传入方法中,改变方法的行为,
	 * 但是并不改变对象的内部状态.
	 */
	public void operation(String state) 
	{
		System.out.println("Intrinsic State = " + intrinsicState +
				",Extrinsic State = " + state);
	};
}
