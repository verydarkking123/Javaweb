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
		int line = -1; // the number of the row, which has Small Temperature Spread
		int mxt = -1; // the number of the column, which is mxt
		int mnt = -1; // the number of the column, which is mnt
		int day = -1; // the number of the column, which is mnt
		if (dataset.size() == 0)
			return String.valueOf(-1);
		for (int i = 0; i < dataset.get(0).length; i++) {
			if (dataset.get(0)[i].equals(MxTColum))
				mxt = i;
			if (dataset.get(0)[i].equals(MnTColum))
				mnt = i;
			if (dataset.get(0)[i].equals(dayColum))
				day = i;
		}
		if ((mxt == -1) || (mnt == -1) || (day == -1)) 
			return String.valueOf(-1);
		float min = Float.MAX_VALUE;
		for (int i = 1; i < dataset.size(); i++) {
			try {
				float mnt_value = Float.parseFloat(dataset.get(i)[mnt]);
				float mxt_value = Float.parseFloat(dataset.get(i)[mxt]);
				if (min > Math.abs(mnt_value - mxt_value)) {
					min = Math.abs(mnt_value - mxt_value);
					line = i;
				}

			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
		// System.out.println(mnt+" "+mxt+" "+line);
		return String.valueOf(dataset.get(line)[day]);
	}
}
