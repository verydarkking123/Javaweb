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
	 * 
	 * @param dayColum
	 *            mark the column of the day
	 * @param MxTColum
	 *            mark the column of the MxT
	 * @param MnTColum
	 *            mark the column of the MnT
	 * @param filePath
	 *            the filePath of the dataset
	 * @return String of the day number
	 */
	public String findSmallTemperatureSpread(String dayColum, String MxTColum, String MnTColum, String filePath) {
		ArrayList<String[]> dataset = parserData(filePath);
		return getSolution(dayColum, MxTColum, MnTColum, dataset);
	}

	/**
	 * parser the .csv file by a given path
	 * 
	 * @param filePath
	 *            the filePath of the dataset
	 * @return ArrayList<String[]>, String[] stores rows, then ArrayList<String[]>
	 *         stores all the data
	 */
	private ArrayList<String[]> parserData(String filePath) {
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

	/**
	 * iterate all the data and return the wanted solution
	 * 
	 * @param same
	 *            parameters as function findSmallTemperatureSpread
	 * @return String of the day number -1 means error report
	 */
	private String getSolution(String dayColum, String MxTColum, String MnTColum, ArrayList<String[]> dataset) {
		int line = -1; //the number of the row, which has Small Temperature Spread
		int mxt = -1; //the number of the column, which is mxt
		int mnt = -1; //the number of the column, which is mnt
		int day = -1; //the number of the column, which is mnt
		if (dataset.size() == 0)
			return String.valueOf(-1);
		for (int i = 0; i < dataset.get(0).length; i++) {
			if(dataset.get(0)[i].equals(MxTColum))
				mxt=i;
			if(dataset.get(0)[i].equals(MnTColum))
				mnt=i;
			if(dataset.get(0)[i].equals(dayColum))
				day=i;
		}
		if((mxt==-1)||(mnt==-1)||(day==-1))
			return String.valueOf(-1);
		float min=Float.MAX_VALUE;
		for(int i=1;i<dataset.size();i++)
		{
			try {
				float mnt_value=Float.parseFloat(dataset.get(i)[mnt]);
				float mxt_value=Float.parseFloat(dataset.get(i)[mxt]);
				if(min>Math.abs(mnt_value-mxt_value))
				{
					min=Math.abs(mnt_value-mxt_value);
					line=i;
				}
				
			}catch(NumberFormatException e)
			{
				e.printStackTrace();
			}
		}
		//System.out.println(mnt+"   "+mxt+"  "+line);
		return String.valueOf(dataset.get(line)[day]);
	}

}
