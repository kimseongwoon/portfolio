package ch08.sec08;

public class SmartTelevision implements RemoteControl, Searchable {
	// RemoteControl과 Searchable 안에 있는 메소드를 모두 구현
		@Override
		public void search(String url) {
			// TODO Auto-generated method stub
			System.out.println(url +"를 검색합니다.");
		}
		@Override
		public void turnOn() {
			// TODO Auto-generated method stub
			System.out.println("TV를 켭니다.");
		}
		@Override
		public void turnOff() {
			// TODO Auto-generated method stub
			System.out.println("TV를 끕니다.");
		}

}
