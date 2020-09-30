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
		assertEquals("SAD", moodMain.analyseMood("I am very SAD"));
	}
	@Test
	public void whenHappyReturnHappy() {
		assertEquals("HAPPY", moodMain.analyseMood("I am very HAPPY"));
	}
}
