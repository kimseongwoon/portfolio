package ch08.sec09;

public class ExtendedExample {
	public static void main(String[] args) {
		InterfaceCImpl impl = new InterfaceCImpl();
		InterfaceA ia = impl;
		ia.methodA();
		//ia.methodB(); // error -> InterfaceA에는 methodB메소드 없기 때문에 
		InterfaceB ib = impl;
		//ib.methodA(); // error -> InterfaceB에는 methodA메소드 없기 때문에
		ib.methodB(); 
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
	
}
