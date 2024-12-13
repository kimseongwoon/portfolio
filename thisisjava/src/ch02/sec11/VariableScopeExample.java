package ch02.sec11;

public class VariableScopeExample {
	
	public static void main(String[] args) {
		int v1 = 15;
		if(v1 > 10) {
			int v2 = v1 - 10;
			
			v2 = 11;
			v2 = 12;
		}
		//int v3 = v1 + v2 + 5; //v2 변수를 사용할 수 없기 때문에 컴파일 에러 발생
		
		{
			int a1 = 0;
		}
		//a1 = 1;  // a1 변수를 사용하지 못함.
	}

}
