package ch04.sec07;

public class ContinueExample {
	public static void main(String[] args) {
		for (int i=0; i<=10; i+=2) {
//			if(i%2 == 0) {
//				continue;
//			}
			if (i==0) continue;
			System.out.println(i+"");
		}
	}

}
