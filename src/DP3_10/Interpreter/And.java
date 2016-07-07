package DP3_10.Interpreter;

/**
 *	非终结符表达式 
 *	And操作
 */
public class And extends Expression
{
	private Expression left , right;
	
	public And(Expression left , Expression right)
	{
		this.left = left;
		this.right = right;
	}
	
	@Override
	public boolean interpret(Context ctx)
	{
		return left.interpret(ctx) && right.interpret(ctx);//与
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o != null && o instanceof And)
		{
			return this.left.equals(((And)o).left) && this.right.equals(((And)o).right);
		}
		
		return false;
	}
	
	@Override
	public int hashCode()
	{
		return (this.toString()).hashCode();
	}
	
	@Override
	public String toString()
	{
		return "(" + left.toString() + " AND " + right.toString() +")";
	}
}
