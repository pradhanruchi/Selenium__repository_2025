package genericutility;

import java.time.LocalDateTime;
import java.util.Random;
/**
 * @author Ruchi Pradhan
 */

public class JavaUtility {
	/**
	 * This method will return current system date and time in String fromate
	 * @return String
	 */
	public String getSystemTime() {
		return LocalDateTime.now().toString().replace(":", "-");
	}
	/**
	 * This method will return random number within 1000
	 * @return int
	 */
	
	public int getRandomNumber() {
		Random run=new Random();
		return run.nextInt(1000);
	}

}


