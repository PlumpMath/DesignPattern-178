package DP1_2.Factory_Method;

public class GrapeFactory implements FruitGardener
{
	@Override
	public Fruit factory()
	{
		// TODO Auto-generated method stub
		return new Grape();
	}
}
