package seleniumTesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class Junittest {
       @Test
	public void testArea_of_circle()
           {
		Junit.read();
		float ac= Junit.area_of_circle();
		assertTrue(ac >= 50);
	}

    @Test
	public void testPerimeter_of_circle() 
           {
    	Junit.read();
		float pc= Junit.perimeter_of_circle();
		assertTrue(pc >= 50);
            }

    @Test
	public void testArea_of_squre() 
      {
    	Junit.read();
		int as= Junit.area_of_squre();
		assertTrue(as >= 50);
	}

	@Test
	public void testPerimeter_of_squre() 
            {
		Junit.read();
		int p= Junit.perimeter_of_squre();
		assertTrue(p >= 50);
	}

	@Test
	public void testRight_angled()
           {
		Junit.read();
		float art= Junit.right_angled();
		assertTrue(art >= 50);
	}

	@Test
	public void testArea_of_rectangle() 
           {
		Junit.read();
		int ar= Junit.area_of_rectangle();
		assertTrue(ar >= 50);
	}

	@Test
	public void testCurcumference_of_circle()
            {
		Junit.read();
		float C= Junit.curcumference_of_circle();
		assertTrue(C >= 50);
	}

	@Test
	public void testArea_of_cube() 
             {
		Junit.read();
		int acc= Junit.area_of_cube();
		assertTrue(acc >= 50);
	}

	@Test
	public void testPerimeter_of_rectangle() 
             {
		Junit.read();
		int arr= Junit.perimeter_of_rectangle();
		assertTrue(arr >= 50);
	}

	
	@Test
	public void testArea_of_sphere() 
        {
		Junit.read();
		float sp= Junit.area_of_sphere();
		assertTrue(sp >= 50);
	}

	@Test
	public void testCylinder() 
         {
		Junit.read();
		int vc= Junit.cylinder();
		assertTrue(vc >= 50);
	}
	
	@Test
	public void testArea_of_cylinder() 
              {
		Junit.read();
		float sc= Junit.area_of_cylinder();
		assertTrue(sc >= 50);
	}
	
}
