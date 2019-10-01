package function;

public class AccessModifiers {

	public static void main(String[] args) {
		
		AccessModifiers obj=new AccessModifiers();
		obj.publicFunction();
		obj.privateFunction();
		obj.noAccessSpecifierFunction();
		obj.protectedFuntion();
		
	}
	
	public void publicFunction()
	{
		System.out.println("public funtion");
	}
	private void privateFunction()
	{
		System.out.println("private funtion");
	}
	 void noAccessSpecifierFunction()
	{
		System.out.println("no  Access Specifier funtion");
	}
	protected void protectedFuntion()
	{
		System.out.println("protected funtion");
	}

}
