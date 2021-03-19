import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;

public class IncubyteTesting {
	
	@Before
	public void setUp() throws Exception {
	}
	
	
	@Test
	public void test_1() throws Exception {
		Incubyte i_test = new Incubyte();
		assertEquals(0,i_test.Add(""));
	}
	
	@Test
	public void test_2() throws Exception {
		Incubyte i_test = new Incubyte();
		assertEquals(2,i_test.Add("2"));
	}

	@Test
	public void test_3() throws Exception {
		Incubyte i_test = new Incubyte();
		assertEquals(3,i_test.Add("1,2"));
	}
	
	//Test for numbers more that 5
	String numbers = "1,2,3,4,5,6,7";	
	Incubyte test = new Incubyte();
   
	@Test(expected = Exception.class)
	public void testAdd() throws Exception {	
		System.out.println("Excessive amount of numbers");     
		test.Add(numbers);     
	}
	
	
	//Tests for string having new lines between numbers
	@Test() 
	public void test_5() throws Exception {
		Incubyte i_test = new Incubyte();
		assertEquals(6,i_test.Add("1\n2,3"));
	}
	
	@Test() 
	public void test_6() throws Exception {
		Incubyte i_test = new Incubyte();
		assertEquals(6,i_test.Add("1,2\n3"));
	}
	
	@Test() 
	public void test_7() throws Exception {
		Incubyte i_test = new Incubyte();
		assertEquals(6,i_test.Add("1\n2\n3"));
	}
	
	
	//Test for negative numbers more that 5
	String numbers2 = "1,2,-3";	
	Incubyte test2 = new Incubyte();
   
	@Test(expected = Exception.class)
	public void testAdd2() throws Exception {	
		System.out.println("Negative numbers not allowed");     
		test2.Add(numbers2);     
	}

	
}
