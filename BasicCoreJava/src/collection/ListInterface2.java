package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterface2 {

	public static void main(String[] args) {
		List<String>
		 list = new ArrayList<>();
		list.add("animesh");
		list.add("pradeep");
		list.add("mahesh");
		
		for (String s:list)
		{
			System.out.println(s);
		}
		
		list = new LinkedList<>();
		list.add("animesh");
		list.add("pradeep");
		list.add("mahesh");
		
		for (String s:list)
		{
			System.out.println(s);
		}
		
		
		
	}

}
