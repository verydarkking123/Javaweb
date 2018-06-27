package de.exxcellent.Parser;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;


public class CSVParserTest {
	private static CSVParser cs = new CSVParser();
	private static String filePath = "src/main/resources/de/exxcellent/challenge/weather.csv";
	@Test
	public void testParserData() {
		ArrayList<String[]> content=cs.parserData("src/main/resources/de/exxcellent/challenge/weather.csv");
		Assert.assertEquals(30, content.size());
	}

}
