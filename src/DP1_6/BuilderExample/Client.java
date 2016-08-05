package DP1_6.BuilderExample;

public class Client
{
	public static void main(String[] args)
	{
		//1.使用重载构造函数的方式
		NutritionFacts1 cocaCola = new NutritionFacts1(240, 8, 100, 0, 35, 27);
		
		//2.使用JavaBean的setter方法的方式
		NutritionFacts2 pepsi = new NutritionFacts2();
		pepsi.setServingSize(240);
		pepsi.setServings(8);
		pepsi.setCalories(100);
		pepsi.setSodium(35);
		pepsi.setCarbohydrate(27);
		
		//3.使用建造者模式
		NutritionFacts3 coffee = new NutritionFacts3.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();
	}
}
