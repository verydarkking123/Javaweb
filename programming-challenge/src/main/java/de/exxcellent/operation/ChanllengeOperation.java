package de.exxcellent.operation;

import java.util.ArrayList;

/**
 * @author Wang
 * @version Version 1.00 time ${27.06.2018} ${11:28}
 */
public class ChanllengeOperation {
	/**
	 * find the smallest absolute difference between column2 and column3, and return
	 * the required content in column1
	 * 
	 * @param column1
	 *            mark the column of the return value
	 * @param MxTColum
	 *            mark the compared column
	 * @param MnTColum
	 *            mark the compared column
	 * @param ArrayList<String[]>
	 *            the dataset will be handled
	 * @return Result
	 */
	public String findMinimumAbsoluteBetweencolum(String Colum1, String Colum2, String Colum3, ArrayList<String[]> dataset) {
		return getSolution(Colum1, Colum2, Colum3, dataset);
	}

	/**
	 * iterate all the data and return the wanted solution
	 * 
	 * @param same
	 *            parameters as function 
	 * @return String of the day number -1 means error report
	 */
	private String getSolution(String dayColum, String MxTColum, String MnTColum, ArrayList<String[]> dataset) {
		return null;
	}
}
