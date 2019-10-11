package oops.inheritence;

public class Babasaheb {

	public static void main(String[] args) {

		SmartPhone p= new SmartPhone();
		
		p.calling();
		p.texting();
		p.internet();
		
		Telephone p2=new Telephone();
		p2.calling();
		
		Telephone p3= new SmartPhone();
		p3.calling();
	}

}
