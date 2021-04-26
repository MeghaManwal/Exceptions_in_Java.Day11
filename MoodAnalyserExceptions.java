package exceptionTest;

public  class MoodAnalyserException {
	
        static final String message=" ";
	
	public static String MoodAnalyserException() {
		
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
		String mood=MoodAnalyserException.MoodAnalyserException();
		mood=MoodAnalyserException.MoodAnalyserException();
		System.out.println(mood);
		assertEquals("HAPPY", mood);
	}

	@Test
	public void givenMood_shouldReturnSad() {
		String message="SAD";
		String mood=MoodAnalyserException.MoodAnalyserException();
		mood=MoodAnalyserException.MoodAnalyserException();
		System.out.println(mood);      
		assertEquals("SAD", mood);
	}
}
