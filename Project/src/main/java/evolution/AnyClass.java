package evolution;

import org.apache.log4j.Logger;

public class AnyClass {
	final static Logger logger = Logger.getLogger(AnyClass.class);
	
	public static void main(String[] args) {
		if(logger.isDebugEnabled()){
		    logger.debug("Debug is Enabled.");
		}
		// Trace < Debug < Info < Warn < Error < Fatal
		logger.trace("Trace");
		logger.debug("Debug");
		logger.info("Info");
		logger.warn("Warn");
		logger.error("Error");
		logger.fatal("Fatal");
	}
}
