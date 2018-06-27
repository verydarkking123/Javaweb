package de.exxcellent.challenge;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ChanllengeSolverTest {
	private static ChanllengeSolver cs = new ChanllengeSolver();
	private static String filePath = "src/main/resources/de/exxcellent/challenge/weather.csv";

	@Test
	public void testFindSmallTemperatureSpread() {
		String solution = cs.findSmallTemperatureSpread("Day", "MxT", "MnT", filePath);
		Assert.assertTrue("14".equals(solution)); //day 14 is the correct solution in the example dataset
	}

}
