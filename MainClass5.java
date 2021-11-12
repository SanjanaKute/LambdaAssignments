package core.Lambda;

import java.util.ArrayList;
import java.util.List;

public class MainClass5 
{
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			List<String> l=new ArrayList<>();
			l.add("John");
			l.add("Alex");
			l.add("Garry");
			
			
			StringBuilder sb=new StringBuilder();
			l.forEach(s->sb.append(s.charAt(0)));
			System.out.println(sb);


	}

}
