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
		assertEquals("SAD", mdMain.analyseMood());
	}
	@Test
	public void whenHappyReturnHappy() {
		MoodAnalyserMain mdMain = new MoodAnalyserMain("I'm HAPPY");
		assertEquals("HAPPY", mdMain.analyseMood());
	}
}
