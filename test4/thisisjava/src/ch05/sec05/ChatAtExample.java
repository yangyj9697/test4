package ch05.sec05;

public class ChatAtExample {
	public static void main(String[] args) {
		String ssn = "9506242230123";
		
		char sex = ssn.charAt(6);
/*		switch(sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}
*/
		if(sex % 2 == 1) {
			System.out.println("남자입니다.");
		}else {
			System.out.println("여자입니다.");
		}
	}

}
