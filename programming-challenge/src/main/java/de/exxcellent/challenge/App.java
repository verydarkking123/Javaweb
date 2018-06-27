package de.exxcellent.challenge;

import de.exxcellent.operation.Logical;

/**
 * The entry class for your solution. This class is only aimed as starting point
 * and not intended as baseline for your software design. Read: create your own
 * classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {
	private static String filePathweath = "src/main/resources/de/exxcellent/challenge/weather.csv";
	private static String filePathfootball = "src/main/resources/de/exxcellent/challenge/football.csv";

	public static void main(String... args) {

		// Your preparation code …
		String ars_weather[] = { "de.exxcellent.Parser.CSVParser", filePathweath, "Day", "MxT", "MnT" };
		String ars_football[] = { "de.exxcellent.Parser.CSVParser", filePathfootball, "Team", "Goals",
				"Goals Allowed" };
		Logical lo = new Logical();
		// Your day analysis function call …
		String dayWithSmallestTempSpread = lo.solveChanllenge(ars_weather);
		String teamWithSmallesGoalSpread = lo.solveChanllenge(ars_football);
		if (dayWithSmallestTempSpread.equals("-1"))
			System.out.printf("file error");// return -1 because nothing has been found 
		else
			System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);
		if (teamWithSmallesGoalSpread.equals("-1"))
			System.out.printf("file error");
		else
			System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallesGoalSpread);
	}
}
