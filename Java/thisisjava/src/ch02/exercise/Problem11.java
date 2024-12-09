package ch02.exercise;

public class Problem11 {
	
	public static void main(String[] args) {
		int v1 = 1;
		System.out.println("v1: " + v1);
		if(true) {
		    int v2 = 2;
		    if(true) {
		        int v3 = 2;
		        System.out.println("v1: " + v1);
		        System.out.println("v2: " + v2);
		        System.out.println("v3: " + v3);
		    }
		    System.out.println("v1: " + v1);
		    System.out.println("v2: " + v2);
		    //System.out.println("v3: " + v3);  // if문에서 정의한 변수는 밖에서 불가능하여 error
		}
		System.out.println("v1: " + v1);
		//System.out.println("v2: " + v2);   // if문에서 정의한 변수는 밖에서 불가능하여 error
	}

}
