package de.exxcellent.operation;

import java.util.ArrayList;

import de.exxcellent.Parser.FileParser;
import de.exxcellent.Parser.ParserFactory;

/**
 * @author Wang
 * @version Version 1.00 time ${27.06.2018} ${11:28}
 */
public class Logical {
	/**
	 * @param the needed parameters will be given, 
	 * agument format args[0] classname of parser
	 * agument format args[1] filepath
	 * agument format args[2] the column of the return value, such the day, the football team
	 * agument format args[3] the compared column1
	 * agument format args[4] the compared column2
	 * @return void
	 */
	public String solveChanllenge(String args[]) {
		ParserFactory pf=new ParserFactory();
    	System.out.println(args[0]);
    	FileParser fp=(FileParser)pf.getParser(args[0]);
    	ArrayList<String[]> dataset= fp.parserData(args[1]);
    	ChanllengeOperation chan=new ChanllengeOperation();
    	return chan.findMinimumAbsoluteBetweencolum(args[2], args[3], args[4], dataset);
	}
}
