package ch05.sec11;

public class MainStringArrayArgumentExample {
	
	public static void main(String[] args) {
		System.out.println(args.length);
		
		for(int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "]: " + args[i]);
		}
		
		if(args.length != 2) {
			System.out.println("프로그램 입력값이 부족");
			System.exit(0);   // 프로그램 종료
		}

		String strNum1 = args[0];
		String strNum2 = args[1];
			
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);

		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}

}
