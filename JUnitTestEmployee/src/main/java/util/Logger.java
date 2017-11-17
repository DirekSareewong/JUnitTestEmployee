package main.java.util;

import org.apache.log4j.*;

public class Logger {
	private static Logger logger = new Logger();
	
	private Logger(){
		//just to prevent other classes to call this
	}
	
	public static Logger getInstance(){
		if(logger == null)
			logger = new Logger();
		return logger;
	}
}
