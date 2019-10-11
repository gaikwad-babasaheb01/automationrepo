package function;

public class Funtion1 {

	public static void main(String[] args) {

//		sum(25,20);
//		sum(41,55);
//		sum(381,427);
//		
		int add=sum1(10,12);
		System.out.println(add);
		
		//int add=sum1(10,20,30);
		
	}
//Type 1
	
	  public static void sum(int a, int b) 
	  { 
		  int add=a+b; 
		  System.out.println(add);
	  }
	  
	 //Type 2
	public static int sum1(int a, int b)
	{
		return a+b;
	}
	
	//Type 3 method overloading
	public static int sum1(int a, int b, int c)
	{
		return a+b+c;
	}
}
