package core.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
//Create a new thread that prints the numbers from the list. use thread & interface consumer
class Print extends Thread
{
	public void run()
	{
		List<Integer> l=new ArrayList<>();
		l.add(36);
		l.add(12);
		l.add(22);
		l.add(13);
		l.add(8);
		
		Consumer<Integer> c=n-> System.out.println(n);
		l.forEach(c);
	}
}
public class MainClass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print p=new Print();
		p.start();
		
	}

}
