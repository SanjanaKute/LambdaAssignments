package core.Lambda;

import java.util.Arrays;
import java.util.List;

public class MainClass6 {

	public static void main(String[] args) 
	{
		String s[]={"hii","hello"};
		List<String>arrayList=Arrays.asList(s);
		arrayList.replaceAll(e->e.toUpperCase());
		System.out.println(arrayList);
		
	}

}
