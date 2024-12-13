package ch08.exercise.problem5;

public class Tv implements Remocon {
	public static void main(String[] args) {
		Remocon r = new Tv();
		r.powerOn();
	}
	
	@Override
	public void powerOn() {
		System.out.println("TV를 킵니다.");
	}

}
