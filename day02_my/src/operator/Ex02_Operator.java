package operator;

public class Ex02_Operator {
	
	//alt + 방향키는 코드 위치 이동
	public static void main(String[] args) {
		// 복합대입연산자 (배정대입연산자)
		int n1 = 10;
		int n2 = 3;
		
		n1 = n1 + n2;	// 10 +3 = 13
		System.out.println(n1);
		
		n1 += n2;		// 13 + 3 = 16
		System.out.println(n1);
		
		n1 -= 2;		// 16 - 2 = 14
		n1 *= 3;		// 14 * 3 = 42 
		n1 %= 4;		// 42 % 4 = 2
		System.out.println(n1);
		
		// 게시물을 클릭할 때 마다 조회수가 1씩 증가하게 만들고 싶다면
		int viewCount = 0;
		viewCount += 1;
		viewCount += 1;
		viewCount += 1;
		viewCount++;	//단항 증감 연산자 (1씩 증가)
		System.out.println("조회수 : " + viewCount);
		
		
		// 비교 연산자 : >, <, >=, <=, ==, !=
		// 비교 연산자의 결과는 boolean 형태로 나타난다 (true / false)
		
		n1 = 10;
		n2 = 3;
		
		System.out.println("n1 > n2 : " + (n1 > n2));	//초과 (gt)
		System.out.println("n1 < n2 : " + (n1 < n2));	//미만 (lt)
		System.out.println("n1 >= n2 : " + (n1 >= n2));	//이상 (ge)
		System.out.println("n1 <= n2 : " + (n1 <= n2));	//이하 (le)
		System.out.println("n1 == n2 : " + (n1 == n2));	//일치 (eq)
		System.out.println("n1 != n2 : " + (n1 != n2));	//불일치 (ne)
		//if, while, for, 삼항연산 등에 활용되기 때문에 중요도가 높다
		
		int age = 20;
		boolean isAdult = age>= 20;
		System.out.println("성인 여부 : " + isAdult);
		
		// = : 대입 연산자 == : 비교연산자
		// 비교연산자는 primitive 타입에 대해서만 작동한다
		// 객체는 별도의 함수를 이용해서 비교해야 한다
		// 문자열의 일치 여부 또한 연산자로 비교할 수 없다
		
	}

}
