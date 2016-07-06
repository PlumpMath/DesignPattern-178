package DP1_2.Factory_Method;

/**
 *	具体产品类 
 */
public class Apple implements Fruit
{
	private int treeAge ;
	@Override
	public void grow()
	{
		log("apple is growing...");
	}

	@Override
	public void harvest()
	{
		log("apple has harvested!!!");
	}
	
	@Override
	public void plant()
	{
		log("apple has planted!!!");
	}
	
//	辅助方法
	public static void log(String msg)
	{
		System.out.println(msg);
	}
	
//    树龄的取值方法
	public int getTreeAge()
	{
		return treeAge;
	}
	
//	树龄的赋值方法
	public void setTreeAge(int treeAge)
	{
		this.treeAge = treeAge;
	}
}
