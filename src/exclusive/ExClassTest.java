package exclusive;

import static org.junit.Assert.*;

import org.junit.Test;


public class ExClassTest {

	@Test
	public void test() 
	{
		assertTrue ("Exclusive multiple  correct", 4 == ExClass.Ex(2));
	}
}
