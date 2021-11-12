package core.Lambda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
public class MainClass4
{
	    public static void main(String[] args) 
	    {
	        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("a", "ab", "cde", "defg", "abcde", "fghijk"));      
	        
	        System.out.println("Original ArrayList          : " + arrayList);
	        arrayList.removeIf(str ->(str.length()%2==0));
	        System.out.println("ArrayList after removeIf()  : " + arrayList);        
	  }

		
}

		