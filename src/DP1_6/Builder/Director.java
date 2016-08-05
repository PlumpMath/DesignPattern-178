package DP1_6.Builder;

//导演者(Director)角色
//担任这个角色的类调用具体建造者角色已创建产品对象
//导演者角色将客户端创建产品的请求划分为对各个零件的建造请求
//再将这些请求委派给具体建造者角色

public class Director
{
    /**
     * 持有当前需要使用的建造器对象
     */
	private Builder builder;

    /**
     * 构造方法，传入建造器对象
     * @param builder 建造器对象
     */
	public Director(Builder builder)
	{
		this.builder = builder;
	}

    /**
     * 产品构造方法，负责调用各个零件建造方法
     */
	public void construct()
	{
		builder.buildPart1();
		builder.buildPart2();
	}
}