package de.exxcellent.Parser;

public class ParserFactory {
	/**
	 * reflection by classname
	 * @param className used to get the instance
	 * @return object the wanted instance of the FileParser
	 */
	public Object getParser(String className) {
		Class<?> cls;
		Object obj=null;
		try {
			cls = Class.forName(className);
			obj = cls.newInstance();
		} catch (ReflectiveOperationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
}
