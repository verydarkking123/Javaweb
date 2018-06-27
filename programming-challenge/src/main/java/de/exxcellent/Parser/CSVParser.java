package de.exxcellent.Parser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Wang
 * @version Version 1.00 time ${27.06.2018} ${11:28}
 * parse .csv file
 */
public class CSVParser implements FileParser {

	/**
	 * parser the .csv file by a given path
	 * 
	 * @param filePath
	 *            the filePath of the dataset
	 * @return ArrayList<String[]>, String[] stores rows, then ArrayList<String[]>
	 *         stores all the data
	 */
	@Override
	public ArrayList<String[]> parserData(String filePath) {
		// TODO Auto-generated method stub
		ArrayList<String[]> content = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			String line = "";
			while ((line = br.readLine()) != null) {
				content.add(line.split(","));
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return content;
	}

}
