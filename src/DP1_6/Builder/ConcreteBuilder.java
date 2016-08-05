package DP1_6.Builder;

//具体建造者(Concrete Builder)角色
//
public class ConcreteBuilder implements Builder
{
	private Product product = new Product();

	/**
	*产品零件建造方法1
	*/
	@Override
	public void buildPart1()
	{
		//构建产品的第一个零件
		product.setPart1("编号：9527");
	}

	/**
	*产品零件建造方法2
	*/
	@Override
	public void buildPart2()
	{
		//构建产品的第一个零件
		product.setPart2("名称：huaan");
	}

	/**
	 * 返回生成的产品对象
	 */
	@Override
	public Product retrieveResult()
	{
		return product;
	}
}