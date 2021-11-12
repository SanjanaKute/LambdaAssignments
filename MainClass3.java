package core.Lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainClass3 
{

	public static void main(String[] args)
	{
		Supplier<String> s= () ->"hii";    //get is the inbuilt method
		System.out.println(s.get());
		
		Supplier<Double> d=() -> Math.random();
		System.out.println(d.get());
		
		Consumer<Integer> c=t -> System.out.println(t);  //it will only accept //accept is the inbuilt methods
		c.accept(10);
		Consumer<String> cs=cs1 -> System.out.println(cs1);
		cs.accept("Hello");
		
		Predicate<Integer> p=t -> t%2==0;             //test is the inbuilt methods
		System.out.println(p.test(6));
		
		Function<Integer, Double> f=(a) ->a/2.0;  //apply is the inbuilt method
		System.out.println(f.apply(25));
	}

}
