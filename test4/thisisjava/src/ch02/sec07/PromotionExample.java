package ch02.sec07;

public class PromotionExample {

	public static void main(String[] args) {
		//자동 타입 변환
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		
		
		//강제형 변환
		int var1 =10;
		byte var2 = (byte) var1;
		System.out.println(var2); //강제 타입 변환 후에 10이 그대로 유지됨.
		
		int var5 =65;
		char var6 = (char) var5;
		System.out.println(var6); //'A'가 출력
		
		
		int a= 5;
		int b= 2;
		float c = (float)(a/b);
		
		System.out.println("a/b = " + c);
		
	}

}
