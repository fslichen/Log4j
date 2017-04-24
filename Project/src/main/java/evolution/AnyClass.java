package evolution;

import org.apache.log4j.Logger;

public class AnyClass {
	final static Logger logger = Logger.getLogger(AnyClass.class);
	
	public static void main(String[] args) {
		if(logger.isDebugEnabled()){
		    logger.debug("Debug is Enabled.");
		}
		logger.trace("Trace");
		logger.info("Info");
		logger.debug("Debug");
		logger.error("Error");
		logger.fatal("Fatal");
	}
}
