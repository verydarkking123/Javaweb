package de.exxcellent.challenge;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 * @author Wang
 * @version Version 1.00 time ${27.06.2018} ${10:28} 
 */
public class ChanllengeSolver {

	/**
	 * find the small temperatureSpread for a given dataset.
	 * @param dayColum mark the column of the day
	 * @param MxTColum mark the column of the MxT
	 * @param MnTColum mark the column of the MnT
	 * @param filePath the filePath of the dataset
	 * @return String of the day number
	 */
	public String findSmallTemperatureSpread(String dayColum, String MxTColum, String MnTColum, String filePath) {
		ArrayList<String[]> dataset = parserData(filePath);
		return getSolution(dayColum, MxTColum, MnTColum, dataset);
	}
	
	/**
	 * parser the .csv file by a given path
	 * @param filePath the filePath of the dataset
	 * @return ArrayList<String[]>, String[] stores rows, then ArrayList<String[]> stores all the data
	 */
	private ArrayList<String[]> parserData(String filePath) {
		// TODO Auto-generated method stub
		ArrayList<String[]> content = new ArrayList<>();
		return content;
	}
	
	/**
	 * iterate all the data and return the wanted solution
	 * @param same parameters as function findSmallTemperatureSpread
	 * @return String of the day number
	 */
	private String getSolution(String dayColum, String MxTColum, String MnTColum, ArrayList<String[]> dataset) {
		return null;
	}

}
