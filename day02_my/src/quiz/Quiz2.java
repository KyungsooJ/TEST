package quiz;

import java.util.Scanner;

public class Quiz2 {
	
	public static void main(String[] args) {
		
		/*
		 * 세 과목의 점수를 정수형태로 입력받고, 이름은 문자열로 입력받으세요
		 * 그런 다음, 점수의 합계와 평균을 구합니다
		 * 이때, 평균은 실수형태로 소수점 둘쨰자리까지 출력할 수 있도록 준비하세요
		 * 
		 * 모든 준비가 끝나면 이름과 합계와 평균만 출력합니다
		 * 
		 * 추가내용) boolean 타입의 변수를 선언하여, 평균이 60점 이상인지 아닌지를 판별하여
		 * 결과를 출력하세요
		 */
		
		
		// 디버깅 시작 : F11
		// 중단점 설정 : Ctrl + Shift + b
		// 다음 코드 실행 : F5(Step into), F6(Step over)
		// 제어문(반복문)에서 값의 변화를 추적하기 위해서 사용할 수 있음
		
		// 1) 변수 선언
		Scanner sc = new Scanner(System.in);
		int eng, kor, jap, total;
		double avg;
		String name;
		boolean Pass; //추가 내용
		
		// 2) 입력
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine(); //문자열은 그냥
		
		System.out.print("영어 점수 : ");
		eng = Integer.parseInt(sc.nextLine()); //정수는 Integer으로 변환
		
		System.out.print("국어 점수 : ");
		kor = Integer.parseInt(sc.nextLine());
		
		System.out.print("일본어 점수 : ");
		jap = Integer.parseInt(sc.nextLine());
		
		// 3)연산 
		total = eng + kor + jap;
		avg = total / 3.0;
		Pass = avg >= 60; //추가 내용
		
		// 4) 출력
		System.out.printf("%s 학생의 점수 합 : %d, 평균은 %.2f, 합격여부 : %s\n", name, total, avg, Pass);
	
		System.out.println("합격 여부 : " + Pass); //추가 내용
		
		// 5) 마무리
		sc.close();
		

	}

}
