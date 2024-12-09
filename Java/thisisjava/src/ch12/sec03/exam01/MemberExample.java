package ch12.sec03.exam01;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		//if(obj1 == obj2)
		if(obj1.equals(obj2)) {  // true
			System.out.println("obj1과 obj2의 회원번호가 동일");
		} else {
			System.out.println("obj1과 obj2의 회원번호가 동일하지 않음");
		}
		
		if(obj1.equals(obj3)) {  // false
			System.out.println("obj1과 obj3의 회원번호가 동일");
		} else {
			System.out.println("obj1과 obj3의 회원번호가 동일하지 않음");
		}
	}

}
