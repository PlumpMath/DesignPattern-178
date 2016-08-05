package DP1_6.BuilderExample;

public class NutritionFacts3
{
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;
	
	public static class Builder
	{
		//必需参数
		private final int servingSize;
		private final int servings;
		
		//给可选参数赋初值
		private int calories = 0;
		private int fat = 0;
		private int sodium = 0;
		private int carbohydrate = 0; 
		
		public Builder(int servingSize , int servings)
		{
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		public Builder calories(int val)
		{
			this.calories = val;
			return this;
		}
		public Builder fat(int val)
		{
			this.fat = val;
			return this;
		}
		public Builder sodium(int val)
		{
			this.sodium = val;
			return this;
		}
		
		public Builder carbohydrate(int val)
		{
			this.carbohydrate = val;
			return this;
		}
		
		public NutritionFacts3 build()
		{
			return new NutritionFacts3(this);
		}
		
	}
	
	public NutritionFacts3(Builder builder)
	{
		this.servingSize = builder.servingSize;
		this.servings = builder.servings;
		this.calories = builder.calories;
		this.fat = builder.fat;
		this.sodium = builder.sodium;
		this.carbohydrate = builder.carbohydrate;
	}
}
