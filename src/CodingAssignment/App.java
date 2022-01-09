package CodingAssignment;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger alogger = new AsteriskLogger();
		alogger.Log("Hello");
		alogger.Error("Adele Hello");
		Logger sLogger = new SpacedLogger();
		sLogger.Log("Hello Again");
		sLogger.Error("You Say Hello I say Goodbye");
	}

}
