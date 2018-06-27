package de.exxcellent.challenge;

/**
 * The entry class for your solution. This class is only aimed as starting point
 * and not intended as baseline for your software design. Read: create your own
 * classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {
	private static String filePathweath = "src/main/resources/de/exxcellent/challenge/weather.csv";

	public static void main(String... args) {

		// Your preparation code …
		ChanllengeSolver cs = new ChanllengeSolver();
		// Your day analysis function call …
		String dayWithSmallestTempSpread = cs.findSmallTemperatureSpread("Day", "MxT", "MnT", filePathweath);

		System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);
	}
}
