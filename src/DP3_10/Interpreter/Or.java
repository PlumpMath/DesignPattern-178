package DP3_10.Interpreter;

/**
 *	非终结符表达式 
 *	Or操作
 */
public class Or extends Expression
{
	private Expression left , right;
	
	public Or(Expression left , Expression right)
	{
		this.left = left;
		this.right = right;
	}
	
	@Override
	public boolean interpret(Context ctx)
	{
		return left.interpret(ctx) || right.interpret(ctx);//或
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o != null && o instanceof And)
		{
			return this.left.equals(((Or)o).left) && this.right.equals(((Or)o).right);
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
		return "(" + left.toString() + " OR " + right.toString() +")";
	}
}
