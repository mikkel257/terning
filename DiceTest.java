package terning;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DiceTest {
	Dice dice;
	@Before
	public void setUp() throws Exception {
		dice = new Dice();
	}

	@After
	public void tearDown() throws Exception {
		dice = null;
	}

	
	//Tester om roll slår mellem 1 og 6
	@Test
	public void testRoll() {
		int value;
		for(int i = 0; i< 100; i++)
		{
			value = dice.roll();
			if(value < 1 || value > 6)
				fail("Terning fik værdi mindre end 1 eller større end 6");
		}
	}
}
