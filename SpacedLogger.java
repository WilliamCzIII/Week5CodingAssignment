package Week5CodingAssignment;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		char[] charLog = log.toCharArray();
	
		for (char e: charLog) {
			System.out.print(e + " ");
		}
		System.out.println("");
		
	}

	@Override
	public void error(String error) {
		char[] charError = error.toCharArray();
		System.out.print("ERROR: ");
		for ( char e: charError) {
			System.out.print(e + " ");
		}
		System.out.println("");
	}

}
