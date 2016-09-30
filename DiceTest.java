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
	
	@Test
	public void test() 
	{
		Dice d3 = new Dice();
		int faceValue = d3.roll();

		int et = 0;
		int to = 0;
		int tre = 0;
		int fire = 0;
		int fem = 0;
		int seks = 0;

		for (int i = 0; i < 60000; i++)
		{

			switch (faceValue)
			{
			case (1): et++;
			break;
			case (2): to++;
			break;
			case(3): tre++;
			break; 
			case(4): fire++;
			break; 
			case(5): fem++;
			break;
			default: seks++;
			}
		}
		boolean expectedEt = true;
		boolean expectedTo = true;
		boolean expectedTre = true;
		boolean expectedFire = true;
		boolean expectedFem = true;
		boolean expectedSeks = true;

		boolean actualEt = et >= 9600 && 10400 >= et;
		boolean actualTo = to >= 9600 && 10400 >= to;
		boolean actualTre = tre >= 9600 && 10400 >= tre;
		boolean actualFire = fire >= 9600 && 10400 >= fire;
		boolean actualFem = fem >= 9600 && 10400 >= fem;
		boolean actualSeks = seks >= 9600 && 10400 >= seks;

		assertEquals(expectedEt, actualEt);
		assertEquals(expectedTo, actualTo);
		assertEquals(expectedTre, actualTre);
		assertEquals(expectedFire, actualFire);
		assertEquals(expectedFem, actualFem);
		assertEquals(expectedSeks, actualSeks);
	}
}
