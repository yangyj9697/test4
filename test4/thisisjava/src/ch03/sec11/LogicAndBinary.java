package ch03.sec11;

public class LogicAndBinary {
	public static void main(String[] args) {
//		
//		boolean a = true;
//		boolean b = false;
//		
//		System.out.println("a&&b : " +(a&&b));
//		System.out.println("a||b : " +(a||b));
//		System.out.println("a==b : " +(a==b));
//		System.out.println("a!=b : " +(a!=b));
//		
		//비트연산자
		int c = 15;
		int d = 8;
		
		System.out.println("c&d : " +(c&d));
		System.out.println("c|d : " +(c|d));
		System.out.println("c=d : " +(~c));
		System.out.println("c^=d : " +(c^=d));
	}
}
