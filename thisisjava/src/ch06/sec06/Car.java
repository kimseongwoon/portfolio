package ch06.sec06;

public class Car {
	
	// 자동차 필드 선언
	// 상태
		int speed = 300;		 // 속도
		double yeonbi;     // 연비(초기값 0.0)
		
		// 고유데이터
		String company = "현대";  // 회사이름
		String[] makePerson;  // 제작자(초기값 null)
		String color;    // 차 색깔(초기값 null)
		boolean isCountryPass;  // 테스트 통과 여부(초기값 false)
		String name;	 // 자동차 이름
		String logo;     // 자동차 로고
		boolean type;  // 차종 여부(가솔린, 디젤, 전기차, 가스 등등)
		String model = "아반떼";
		
		Tire tireFront = new Tire();     // 앞쪽 타이어(참조 변수) 인스턴스화
		Tire tireBackLeft;      // 뒤쪽 왼쪽 타이어(참조 변수) 인스턴스화
		Tire tireBackRight;     // 뒤쪽 오른쪽 타이어(참조 변수) 인스턴스화
		Engine engine1;  // 엔진 인스턴스화
	}

	class Tire {
		// 타이어 필드 선언
		String type;
	}

	class Engine {
		// 엔진 필드 선언
		String type;

}
