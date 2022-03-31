package mavjnit5.basics;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class additionTest {
	addition ob;
	@BeforeAll
	public static void welcome()
	{
		System.out.println("welcome");
	}
	
	@BeforeEach
	void init() {
		 ob=new addition();
	}
	

	@Test
	void testaddition() {
		//fail("Not yet implemented");
		//addition ob=new addition();
		int res=ob.add(3, 4);
		assertEquals(7,res);
	}
	
	@Test
	void testsubn() {
		//fail("Not yet implemented");
		//addition ob=new addition();
		int res=ob.sub(3, 4);
		assertEquals(-1,res);
	}
	
	@Test
	void testmul() {
		
		int res=ob.mul(3, 4);
		assertEquals(12,res);
	}
	
	@Test
	void testdiv() {
		assertThrows(ArithmeticException.class,()->ob.div(1,0),"divide by zero occured");
	}
	
	@Test
	void testall()
	{
		assertAll(	
			() -> assertEquals(0, ob.mul(1, 0)),
			() -> assertEquals(0, ob.sub(1, 1)),
			() -> assertEquals(5, ob.add(2, 3))
			);
	}
		
	@AfterEach
	void cleanup() {
		System.out.println("instance removed");
	}

}
