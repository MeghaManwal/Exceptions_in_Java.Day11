package exceptionTest;

public  class MoodAnalyserException {
	
	static final String message=" ";
	
	public static String MoodAnalyserException() throws CustomException {
	 try {
		  if(message.contains("Sad")) 
		       return "SAD";
	          else    
		       return "HAPPY";
	     } catch (NullPointerException ae) {
	              throw new CustomException("Invalid Mood! Please provide the valid mood ");
	     }
	}
	
        public static String MoodAnalyserException(String message) throws CustomException {
          try {
		   if(message.contains("Sad")) 
			return "SAD";
	           else    
		        return "HAPPY";
    	       } catch (NullPointerException ae) {
    		        throw new CustomException("Invalid Mood! Please provide valid mood ");
	       }
	}
}

class CustomException extends Exception{
	public CustomException(String msg) {
	   super(msg);
	}
}


package exceptionTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MoodAnalyserExceptionTest {

        @Test
	public void givenMood_shouldReturnHappy() {
		String message = null;
	  try {
		String mood=MoodAnalyserException.MoodAnalyserException(message);
		System.out.println(mood);
		
		
		mood=MoodAnalyserException.MoodAnalyserException();
		System.out.println(mood);
		 
		assertEquals("HAPPY", mood);
	      } catch (CustomException e) {
		   System.out.println(e);
	      }
	}
	
	@Test
	public void givenMood_shouldReturnSad() throws CustomException {
		String message =null;
	  try {
		String mood=MoodAnalyserException.MoodAnalyserException(message);
		System.out.println(mood);
		
		mood=MoodAnalyserException.MoodAnalyserException();
		System.out.println(mood);  
		
	 	assertEquals("HAPPY", mood);
	       }catch (CustomException e) {
			System.out.println(e);
	       } 
	}

}
