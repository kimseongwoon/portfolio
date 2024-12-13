package ch03.sec11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : 'F'; // score가 90보다 크면 char 'A'값을 grade변수 저장. 아니면 'F'를 저장
		grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' ); // score가 90보다 크면 char 'A'값을 grade변수 저장. 80에서 90사이이면 'B'. 아니면 'C'
		
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}

}
