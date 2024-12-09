package ch06.exercise;

public class Problem15 {
	public static void main(String[] args) {
		MemberService memberServce
			= new MemberService();
		
		boolean result = memberServce.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
	}

}

//class MemberService {
//
//}