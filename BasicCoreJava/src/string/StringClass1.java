package string;

public class StringClass1 {

	public static void main(String[] args) {

		String str= "anaNd ";
		//fun 1
		System.out.println(str.length());
		
		//fun 2
		System.out.println(str.charAt(4));
		
		//fun 3
		System.out.println(str.toUpperCase());
		
		//fun 4
		System.out.println(str.toLowerCase());
		
		//fun 5
		System.out.println(str.trim());
		
		String str2="anand";
		
		//fun 6
		System.out.println(str.contentEquals(str2));
		
		//fun 7
		System.out.println(str.trim().equalsIgnoreCase(str2));
		
		//fun 8
		System.out.println(str.replace("n","a"));
		
		//fun 9
		String[] temp=str.split("n");
		
		for(String s:temp)
		{
			System.out.println(s);
		}
		
		//fun 10
		System.out.println(str2.substring(2));
		
		//fun 11  collection means interfaces and classes which is help us to deal nature 
		System.out.println(str2.subSequence(1, 3));
	}

}
