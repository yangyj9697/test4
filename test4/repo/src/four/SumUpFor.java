package four;

import java.util.Scanner;

public class SumUpFor {
	public static void main(String[] args) {
		Scanner stdIN = new Scanner(System.in);
		System.out.print("1부터 n까지의 합을 구합니다.");
		int n;
		do {
			System.out.print("n의 값 :");
			n= stdIN.nextInt();
		}while (n<=0);
		
		int sum = 0;
		for(int i =0; i<=n; i++)
			sum+=i;
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
		
	}

}
