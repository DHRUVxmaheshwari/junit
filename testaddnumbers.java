package junittestpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddnumbers {

	@Test
	public void test() {
		junitfunctions obj1= new junitfunctions();
		int result = obj1.add(10, 20);
		assertEquals(30,result); 
	}

}
