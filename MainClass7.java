package core.Lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
//convert every key value pair of map int string and append them all into a single string.
//use map.entrySet()method & a stringbuilder to construct the result string.
public class MainClass7
{
	public static void	 main(String[] args) throws Exception
	{
		Map<Integer, String> students = new HashMap<>();
		StringBuilder s=new StringBuilder();
		students.put(132, "Garry");
		students.put(256, "Alex");
		students.put(115, "Jack");
		students.put(115, "Jill");

		for(Entry<Integer,String>m:students.entrySet())
		{
			s.append(m);
			
		}
		System.out.println("Single list: " + s);

		//System.out.println("Print Map: " + students);
	/*	List<Map.Entry<Integer, String>> singleList = students.entrySet()
		        .stream()
		        .collect(Collectors.toList());*/
		        
		System.out.println("Single list: " + s);
	}
}
	



