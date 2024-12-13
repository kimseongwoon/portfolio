package ch08.sec10.exam02;

public class CastingExample {
	
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		vehicle.run();
		//vehicle.checkFare(); // error -> Vehicle 인터페이스에 checkFare메소드가 없기 때문에
		
		Bus bus = (Bus)vehicle;  // 강제 타입으로 변환
		bus.run();
		bus.checkFare();
	}

}
