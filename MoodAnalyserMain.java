public class MoodAnalyserMain{
	public String message;
	
	public MoodAnalyserMain() {
		
	}
	public MoodAnalyserMain(String message) {
		this.message = message;
	}
	
	public String analyseMood() throws MoodAnalysisException {
		//MoodAnalyserMain moodAnalyser = new MoodAnalyserMain("Iam HAPPY");
		try {
			if(message.length()==0)
				throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, "Enter Proper Mood");			
			else if(message.contains("HAPPY"))
				return "HAPPY";
			else 
				return "SAD";
		}
		catch(Exception e) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL, "Enter Proper Mood");
		}
	}
	
}