package three;

import java.util.Scanner;

public class putAsteriskAlt2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇 개를 표시 할까요? : ");
		int n = stdIn.nextInt();
		if(n > 0) {
			int i=0;
			while(i < n/2) { //n/2개의 *+를 출력
				System.out.print("*+");
				i++;
			}
			if(n % 2 == 1)
				System.out.print('*');
			System.out.println();
		}
	}

}
