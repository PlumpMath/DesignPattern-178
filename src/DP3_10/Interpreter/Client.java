package DP3_10.Interpreter;

/**
 *	客户端角色
 */
public class Client
{
	private static Context ctx;
	private static Expression exp;
	
	public static void main(String[] args)
	{
		ctx = new Context();
		
		//新建变量x , y
		Variable x = new Variable("x");
		Variable y = new Variable("y");
		
		Constant c = new Constant(true);
		
		//给变量赋值
		ctx.assign(x, false);
		ctx.assign(y, true);
		
		//新建表达式
		exp = new Or(new And(c , x) , new And(y , new Not(x)));
		
		System.out.println("x = " + x.interpret(ctx));
		System.out.println("y = " + y.interpret(ctx));
		System.out.println(exp.toString() + " = " + exp.interpret(ctx));
	}
}
