package ch11.sec04;

public class TryWithResourceExample {
	public static void main(String[] args) {	
		try (MyResource res = new MyResource("A")) {
//			res.close(); // 하지 않아도 됨
			res.read1();
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
		
		try (MyResource res = new MyResource("A")) {
//			res.close(); // 하지 않아도 됨
			String data = res.read2();  
			int value = Integer.parseInt(data);  // NumberFormatException 발생
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
		
		MyResource res1 = new MyResource("A"); 
		MyResource res2 = new MyResource("B");
		try (res1; res2) {
			String data1 = res1.read1();
			String data2 = res2.read1();
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
	}

}
