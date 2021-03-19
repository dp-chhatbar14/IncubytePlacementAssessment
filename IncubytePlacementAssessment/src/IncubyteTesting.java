import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;

public class IncubyteTesting {
	
	@Before
	public void setUp() throws Exception {
	}
	
	
	@Test
	public void test_1() {
		Incubyte i_test = new Incubyte();
		assertEquals(0,i_test.Add(""));
	}
	
	@Test
	public void test_2() {
		Incubyte i_test = new Incubyte();
		assertEquals(2,i_test.Add("2"));
	}

	@Test
	public void test_3() {
		Incubyte i_test = new Incubyte();
		assertEquals(3,i_test.Add("1,2"));
	}
	

	
}
