package core.Lambda;

@FunctionalInterface
interface Arithmetic
{
	int operation (int a, int b);
}
public class MainClass1 
{

	public static void main(String[] args) 
	{
	/*	Arithmetic addition= new Arithmetic() //(int a, int b) -> (a+b);
			{
				@Override
				public int operation(int a, int b){
					return (a+b);
				}
			};*/
		
		Arithmetic addition=(int a, int b) -> (a+b);
		System.out.println("Addition: "+addition.operation(20, 10));  //		System.out.println("Addition: "+addition);

		Arithmetic subtract=(int a, int b) -> (a-b);
		System.out.println("Subtraction: "+subtract.operation(20, 10));
		
		Arithmetic multiply=(int a, int b) -> (a*b);
		System.out.println("Multiplication: "+multiply.operation(10, 20));
		
		Arithmetic division=(int a, int b) -> (a/b);
		System.out.println("Division: "+division.operation(20, 20));
		
		
	}

}
