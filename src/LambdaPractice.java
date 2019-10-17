
public class LambdaPractice {

	
	
	public static void main(String[] args) {
		
		
		MyLambda statement=new Expression();
		statement.foo();
		
		MyLambda mylambda=()-> System.out.println("Hello world");
		mylambda.foo();

	}
	

}
interface MyLambda
{
	void foo();
	
	
}
class Expression implements MyLambda
{
	public void foo()
	{
		System.out.println("hello world");
	}
}
