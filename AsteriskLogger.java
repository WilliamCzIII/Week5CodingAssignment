package Week5CodingAssignment;

public class AsteriskLogger implements Logger{
	
	
		
		@Override
		public void log(String log) { // takes a String and prints out that String surrounded by asterisks
			System.out.println("***"+ log+ "***");
			
		}
		@Override
		public void error(String error) { //
			System.out.println("**************");
			System.out.println("***"+ error + "***");
			System.out.println("**************");
			
	}
}


