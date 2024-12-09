package ch05.sec09;

public class ArrayCopyExample {
	
	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		
		// 자바의 System.arraycopy 함수 사용하여 배열 항목 값 복사
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		// 출력
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}

}
