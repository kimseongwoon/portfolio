package ch02.sec10;

public class PrimitiveAndStringConversionExample {
	
	public static void main(String[] args) {
		// 문자열을 기본 타입으로 변환
		String str1 = "10";
		byte value1 = Byte.parseByte(str1);      // 문자 10을 숫자 10 byte로 변경
        String str2 = "200";
        int value2 = Integer.parseInt(str2);     // 문자 200을 숫자 200 int로 변경
        String str3 = "200000000";
        long value3 = Long.parseLong(str3);      // 문자 200000000을 숫자 200000000 long로 변경
        String str4 = "12.345";
        double value4 = Double.parseDouble(str4);  // 문자 12.345을 숫자 12.345 double로 변경
        String str5 = "true";
        boolean value5 = Boolean.parseBoolean(str5); // 문자 true을 boolean true로 변경
        
        // 기본 타입을 문자열로 변환
        String a1 = String.valueOf(10);
        String a2 = String.valueOf(200);
        String a3 = String.valueOf(200000000L);
        String a4 = String.valueOf(12.345);
        String a5 = String.valueOf(true);
	}

}
