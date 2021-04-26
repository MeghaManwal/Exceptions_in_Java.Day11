package exceptionTest;

public  class MoodAnalyserException {
	
	static final String message=" ";
	
	public static String MoodAnalyserException() {
		
		if(message.contains("Sad")) 
             	    return "SAD";
	        else    
		    return "HAPPY";
	}
	
    	public static String MoodAnalyserException(String message) {
		
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
		System.out.println(mood);
		mood=MoodAnalyserException.MoodAnalyserException();
		System.out.println(mood);
		assertEquals("HAPPY", mood);
	}

	@Test
	public void givenMood_shouldReturnSad() {
		String message="I am in Sad mood";
		String mood=MoodAnalyserException.MoodAnalyserException(message);
		System.out.println(mood);
		mood=MoodAnalyserException.MoodAnalyserException();
		System.out.println(mood);      
		assertEquals("HAPPY", mood);
	}
}
