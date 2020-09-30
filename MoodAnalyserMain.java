public class MoodAnalyserMain{
	public String message;
	
	public MoodAnalyserMain() {
		
	}
	public MoodAnalyserMain(String message) {
		this.message = message;
	}
	
	public String analyseMood() {
		//MoodAnalyserMain moodAnalyser = new MoodAnalyserMain("Iam HAPPY");
		try {
			
			if(message.contains("HAPPY"))
				return "HAPPY";
			else 
				return "SAD";
		}
		catch(NullPointerException e) {
			return "HAPPY";
		}
	}
	
}