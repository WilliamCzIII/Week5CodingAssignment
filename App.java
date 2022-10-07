package Week5CodingAssignment;

public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		logger.log("Hello");
		System.out.println();
		logger.error("Goodbye");
		
		System.out.println("");
		
		Logger logger2 = new SpacedLogger();
		logger2.log("Hello");
		System.out.println("");
		logger2.error("Goodbye");

	}

}
