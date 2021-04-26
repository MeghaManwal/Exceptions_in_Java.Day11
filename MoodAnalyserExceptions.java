package exceptionTest;

public  class MoodAnalyserException {
	
	public static String MoodAnalyserException(String message) {
		if(message.equals("SAD"))
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
		String message="HAPPY";
		String mood=MoodAnalyserException.MoodAnalyserException(message);
		assertEquals("HAPPY", mood);
	}
	
	@Test
	public void givenMood_shouldReturnSad() {
		String message="SAD";
		String mood=MoodAnalyserException.MoodAnalyserException(message);
		assertEquals("SAD", mood);
	}
}
