package ch07.sec09;

public class InstanceOfExample {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		personInfo(p1);		// false
		
		System.out.println();
		
		Person p2 = new Student("김길동", 10);
		personInfo(p2);		// true
	}
	
	public static void personInfo(Person person) {
		System.out.println("name: " + person.name);
		person.walk();
		
		// person이 Student타입이면 true이고 아니면 false
		// person이 될 수 있는 타입들 -> Person, Student
		if(person instanceof Student) {
			Student student = (Student)person;
			System.out.println("studentNo: " + student.studentNo);
			student.study();
		}
	}

}
