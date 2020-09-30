import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;



public class MoodAnalyserMainTest2 {
	public MoodAnalyserMain moodMain;
	
	@Before
	public void initialize() {
		moodMain = new MoodAnalyserMain();
	}
	
	@Test
	public void whenSadReturnSAD() {
		MoodAnalyserMain mdMain = new MoodAnalyserMain("I'm SAD");
		try {
			assertEquals("SAD", mdMain.analyseMood());
		} catch (MoodAnalysisException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void whenHappyReturnHappy() {
		MoodAnalyserMain mdMain = new MoodAnalyserMain();
		try {
			assertEquals("HAPPY", mdMain.analyseMood());
		} catch (MoodAnalysisException e) {
			System.out.println(e.getMessage());
			
		}
	}
	@Test
	public void testing_When_Null() {
		String mood;
		MoodAnalyserMain mdMain = new MoodAnalyserMain();
		try {
			mood = moodMain.analyseMood();
		}
		catch(MoodAnalysisException e) {
			System.out.println(e.getMessage());
			assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.exceptionType);
		}
	}
	@Test
	public void testing_When_Empty() {
		String mood;
		MoodAnalyserMain mdMain = new MoodAnalyserMain("");
		try {
			mood = moodMain.analyseMood();
		}
		catch(MoodAnalysisException e) {
			System.out.println(e.getMessage());
			assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
		}
	}
}
