package ch06.sec11;

public class Korean {
	// final 필드는 값을 한번 세팅하면 수정 불가
		final String nation = "대한민국";
		final String ssn;			
		
		String name;
		
		public Korean(String ssn, String name) {
			this.ssn = ssn;
			this.name = name;
		}

}
