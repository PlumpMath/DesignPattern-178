package DP1_6.Builder;

/**
 *	抽象建造者 
 */
public interface Builder
{
	public void buildPart1();

	public void buildPart2();

	public Product retrieveResult();
}
