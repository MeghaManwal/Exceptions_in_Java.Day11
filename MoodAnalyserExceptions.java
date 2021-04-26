package exceptionTest;

public  class MoodAnalyserException {

	public static String MoodAnalyserException (String message) {
		
		if(message.contains("Sad")) 
		       return "SAD";
	        else    
		       return "HAPPY";
	}
}

package exceptionTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MoodAnalyserExceptionTest {
	
	@Test
	public void givenMood_shouldReturnHappy() {
		String message="I am in Happy mood";
		String mood=MoodAnalyserException.MoodAnalyserException(message);
		assertEquals("HAPPY", mood);
	}
	
	@Test
	public void givenMood_shouldReturnSad() {
		String message="I am in Sad mood";
		String mood=MoodAnalyserException.MoodAnalyserException(message);
		assertEquals("SAD", mood);
	}
}
