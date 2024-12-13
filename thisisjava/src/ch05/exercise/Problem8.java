package ch05.exercise;

public class Problem8 {
	
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
			};

		int sum = 0;      // 전체 합
		double avg = 0.0; // 평균
		
		int count = 0;
		for(int i=0; i < array.length; i++) {
			for(int j=0; j < array[i].length; j++) {
				sum += array[i][j];
				//count++;
			}
			count += array[i].length;   // 2 + 3 + 5
		}
		
		avg = (double)sum / count;
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}

}
