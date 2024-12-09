package ch07.sec07;

class A {
}

class B extends A {
}

class C extends A {
}

class D extends B {
}

class E extends C {
}

public class PromotionExample {
	public static void main(String args[]) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		B b0 = (B) new A();
		method(b0);
		
		A a1 = b;   // b 객체를 A클래스의 변수로 대입 가능(조상이 A클래스이므로)
		A a2 = c;   // c 객체를 A클래스의 변수로 대입 가능(조상이 A클래스이므로)
		A a3 = d;   // d 객체를 A클래스의 변수로 대입 가능(조상이 A클래스이므로)
		A a4 = e;   // e 객체를 A클래스의 변수로 대입 가능(조상이 A클래스이므로)
		
		B b1 = d;   // d 객체를 B클래스의 변수로 대입 가능(부모가 B클래스이므로)
		C c1 = e;   // e 객체를 C클래스의 변수로 대입 가능(부모가 C클래스이므로)
		
		//B b2 = e;  // error. 상속관계에 있지 않기 때문에 대입이 불가
		//C c2 = d;  // error. 상속관계에 있지 않기 때문에 대입이 불가
	}
	
	static void method(B b) {
		
	}

}
