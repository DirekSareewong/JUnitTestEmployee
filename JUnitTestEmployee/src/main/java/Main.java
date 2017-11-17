package main.java;

import org.apache.log4j.Logger;

public class Main {

	static Logger log = Logger.getLogger(Main.class.getName());
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		log.debug("this is a debug level log");
		log.info("this is an info level log");

	}

}
