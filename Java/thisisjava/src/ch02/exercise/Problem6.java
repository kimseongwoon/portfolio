package ch02.exercise;

public class Problem6 {
	
	public static void main(String[] args) {
		int intValue = 10;
		char charValue = 'A';
		double doubleValue = 5.7;
		String strValue = "A";
		
		int var = (int) doubleValue;
		System.out.println("var: " + var);    // 5 
		
		char var2 = strValue.toCharArray()[0];  // error

	}

}
