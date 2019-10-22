package seleniumTesting;

import java.util.Scanner;
public class Junit
 {
	
	private static Scanner s;

	public static void read()

	{
		s = new Scanner(System.in);
            }
	
	
public static float area_of_circle()
	{
       System.out.println("1.Area of a Circle");
       System.out.println("Enter radius:");
       float r=s.nextFloat();
       float ac=3.14f*r*r;
       System.out.println("Area:"+ac);
       return ac;
	 }
	
public static float perimeter_of_circle()
	   {
	System.out.println("2.Perimeter of a circle");
	System.out.println("Enter radius:");
            float r=s.nextFloat();
            float pc=3.14f*2*r;
           System.out.println("Area:"+pc);
	return pc;
	   }
	
	
 public static int area_of_squre()
	 {
      System.out.println("3.Area of a Square");
      System.out.println("Enter side:");
       int x=s.nextInt();
       int as=x*x;
       System.out.println("Area:"+as);
      return as;
	 }
	
public static int perimeter_of_squre()
              {
      System.out.println("4.Perimeter of Square");
      System.out.println("Enter side:");
      int X=s.nextInt();
      int p=4*X;
      System.out.println("Perimeter:"+p);
      return p;
	   }
		
public static float right_angled()
	{
      System.out.println("5.Area of a Right Angled Triangle");
       System.out.println("Enter height and base:");
       float h=s.nextFloat();
       float bs=s.nextFloat();
       float art=0.5f*h*bs;
       System.out.println("Area:"+art);
       return art;
	}
		
public static int area_of_rectangle()
	{
     System.out.println("6.Area of a Rectangle");
      System.out.println("Enter length and breadth:");
       int l=s.nextInt();
       int b=s.nextInt();
       int ar=l*b;
       System.out.println("Area:"+ar);
       return ar;
	}
	
public static float curcumference_of_circle()
	{
       System.out.println("7.Circumference of a Circle");
        System.out.println("Enter radius:");
        float R=s.nextFloat();
       float C=3.14f*2f*R;
       System.out.println("Circumference:"+C);
       return C;
	}
	
public static int area_of_cube()
	   {
          System.out.println("8.Area of cube");
	System.out.println("Enter area of cube:");
            int a=s.nextInt();
            int acc=6*a*a;
            System.out.println("Cube:"+acc);
	return acc;
	    }
	
public static int perimeter_of_rectangle()
	{
      System.out.println("9.Perimeter of a rectangle");
      System.out.println("Enter length and breadth:");
      int l=s.nextInt();
       int b=s.nextInt();
       int arr=2*l*b;
       System.out.println("Perimeter:"+arr);
       return arr;
	}
	
public static float area_of_sphere()
	{
      System.out.println("10.Area of sphere");
      System.out.println("Enter radius:");
       float r=s.nextFloat();
       float sp=3.14f*4*r*r;
       System.out.println("Surface_Area:"+sp);
       return sp;
	}
	
public static int cylinder()
	{
      System.out.println("11.Volume of cylinder");
      System.out.println("Enter base and height:");
       int h=s.nextInt();
       int b=s.nextInt();
       int vc=h*b;
       System.out.println("Volume:"+vc);
       return vc;
	}
	
public static float area_of_cylinder()
	{
   System.out.println("12.Area of cylinder");
   System.out.println("Enter radius and height:");
    float r=s.nextFloat();
    float h=s.nextFloat();
    float sc=3.14f*2*r*h;
       System.out.println("Area_of_cylinder:"+sc);
       return sc;
		}
	public static void main(String[] args)
	{
		read();
		area_of_circle();
		perimeter_of_circle();
		area_of_squre();
		perimeter_of_squre();
		right_angled();
		area_of_rectangle();
		curcumference_of_circle();
		area_of_cube();
		perimeter_of_rectangle();
		area_of_sphere();
		cylinder();
		area_of_cylinder();
		}
	}


