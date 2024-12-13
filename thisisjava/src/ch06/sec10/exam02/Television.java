package ch06.sec10.exam02;

public class Television {
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;

	// 생성자에서 초기화를 하지 않는 필드일 때 주로 사용
	static {
		info = company + "-" + model;
	}

}
