package exceptionTest;

public  class MoodAnalyserException {
	
	static final String message=" ";
	
	public static String MoodAnalyserException() {
	    try {
		  if(message.contains("Sad")) 
		       return "SAD";
	          else    
		       return "HAPPY";
	         } catch (NullPointerException ae) {
	              return "HAPPY";
	         }
	}
	
        public static String MoodAnalyserException(String message) {
            try {
		  if(message.contains("Sad")) 
		       return "SAD";
	          else    
		       return "HAPPY";
    	        } catch (NullPointerException ae) {
	           return "HAPPY";
	        }
       }
}



package exceptionTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MoodAnalyserExceptionTest {

	@Test
	public void givenMood_shouldReturnHappy() {
		String message = null;
		
		String mood=MoodAnalyserException.MoodAnalyserException(message);
		System.out.println(mood);
		
		mood=MoodAnalyserException.MoodAnalyserException();
		System.out.println(mood);
		
		assertEquals("HAPPY", mood);
	}
	
	@Test
	public void givenMood_shouldReturnSad() {
		String message =null;
		
		String mood=MoodAnalyserException.MoodAnalyserException(message);
		System.out.println(mood);
		
		mood=MoodAnalyserException.MoodAnalyserException();
		System.out.println(mood);  
		
		assertEquals("HAPPY", mood);
	}
}
