package CodingAssignment;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String string) {
		if (string != null) {
			System.out.print("\n");
			char[] sArr = string.toCharArray();
			for ( int i = 0 ; i < sArr.length; i++) System.out.print(sArr[i]+" ");		
		}
	}

	@Override
	public void Error(String string) {
		if (string != null) {
			System.out.print("\nERROR: ");
			char[] sArr = string.toCharArray();
			for ( int i = 0 ; i < sArr.length; i++) System.out.print(sArr[i]+" ");		
		}
		
	}

}
