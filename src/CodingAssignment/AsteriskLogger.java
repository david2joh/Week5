package CodingAssignment;

class AsteriskLogger implements Logger {

	@Override
	public void Log(String string) {
		// TODO Auto-generated method stub
		if (string != null) System.out.println("\n*** "+ string+ " ***");
	}

	@Override
	public void Error(String string) {
		// TODO Auto-generated method stub
		if (string != null) 
		{
			int size = string.length() + 13;
			System.out.println("\n"+"*".repeat(size));
			System.out.print("***Error: "+string+"***");
			System.out.println("\n"+"*".repeat(size));
		}
		
	}

}
