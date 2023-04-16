package operator;

import java.util.Scanner;

public class Ex06_Equals {
	
	public static void main(String[] args) {
		
		// 참조의 대상이 같은 경우와 값이 같은 경우
		Scanner sc = new Scanner(System.in);
		System.out.print("apple 이라고 입력하세요 : ");
		
		//reference type이라 어떤 대상을 가르키고 있느냐가 중요 !
		String s1 = "apple";
		String s2 = "apple";
		String s3 = new String("apple"); //새로운 'apple'을 추가로 생성해서  s3가 그것을 가르킴
		String s4 = sc.nextLine();		//빈공간을 생성, s4가 그것을 가르킴
		
		System.out.println(" s1 == s2 : " + (s1 == s2));
		System.out.println(" s1 == s3 : " + (s1 == s3));	//서로 저장 되어있는 공간이 다름
		System.out.println(" s1 == s4 : " + (s1 == s4));	//서로 저장 되어있는 공간이 다름
		System.out.println();
		
		// 참조값을 비교하지 않고, 값의 일치여부를 비교하려면 A.equals(B) 를 사용한다
		System.out.println(" s1.equals(s2) : " + s1.equals(s2)); //서로 저장된 다른 위치가 달라도 가르키는 것이 같음
		System.out.println(" s1.equals(s3) : " + s1.equals(s3));
		System.out.println(" s1.equals(s4) : " + s1.equals(s4));
		System.out.println();
		
		sc.close();

		
	}

}
