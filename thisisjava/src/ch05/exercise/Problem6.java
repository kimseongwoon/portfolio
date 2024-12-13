package ch05.exercise;

public class Problem6 {
	
	public static void main(String[] args) {
		int[][] array = {
			{95, 86},
			{83, 92, 96},
			{78, 83, 93, 87, 88}
		};
		
		int[][] array1 = new int[3][];  // array
		int[] array1_1 = new int[2];  // array[0]
		int[] array1_2 = new int[3];  // array[1]
		int[] array1_3 = new int[5];  // array[2]
		
		System.out.println(array.length);      // 3
		System.out.println(array[2].length);   // 5
	}

}
