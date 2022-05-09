package exercise;

import java.io.File;
import java.io.FileInputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;

class Log4j2 {
	 Log4j2() {
		try {
			ConfigurationSource source;
			File config = new File("//home//sixson//eclipse-workspace//ExerciseLog4j2//src//lib//log4j2.xml");
			source = new ConfigurationSource(new FileInputStream(config), config);
			Configurator.initialize(null, source);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	 
	 public static void wirteLog(String result) 
	 {
			Logger LOGGER = LogManager.getFormatterLogger("LogName");
			LOGGER.info(result);
			LOGGER.fatal(result);
			LOGGER.error(result);
			LOGGER.warn(result);
			LOGGER.info(result);
			LOGGER.debug(result);
			LOGGER.trace(result);
	 }
}
public class ExerciseLog4j2 {
	public static void main(String[] args) {
		Log4j2 wrLog = new Log4j2();
		wrLog.wirteLog("first log4j2 program");
	}
}
