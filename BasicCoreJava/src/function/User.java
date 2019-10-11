package function;

public class User {

	public static void main(String[] args) {

		Car polo =new Car();
		polo.wheels=5;
		polo.color="silver";
		polo.type="hatchback";
		polo.accelaration();
		
		Car car2=new Car();
		car2.wheels=4;
		car2.color="black";
		car2.type="sedan";
		car2.accelaration();
		
		Car car3=new Car();
		System.out.println(polo.color);
 		System.out.println(car2.color);
		System.out.println(car3.color);
		
		System.out.println(polo.wheels);
		System.out.println(car2.wheels);
		System.out.println(car3.wheels);
	}

}
