package ch06.exercise;

public class ShopService {
	//private 접근 권한을 갖는 정적 필드 선언과 초기화
		private static ShopService shopService 
			= new ShopService();

		//private 접근 권한을 갖는 생성자 선언
		private ShopService() {
		}

		//public 접근 권한을 갖는 정적 메소드 선언
		public static ShopService getInstance() {
			return shopService;
		}

}
