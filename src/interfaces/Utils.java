package interfaces;

public class Utils {
	public static void Runloggers(Logger[] loggers, String message) {
		// TODO Auto-generated method stub
		for(Logger logger:loggers) {
			logger.log(message);
	}
}
}
	
