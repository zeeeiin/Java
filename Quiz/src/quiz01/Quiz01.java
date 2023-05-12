package quiz01;

public class Quiz01 {

	public static void main(Month[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		
		
		System.out.println(y += 10 - x++); //5+10 - 2 = 13
		//++은 제일 마지막, 대입은 그 전에.. 마지막 직전에
		// 10-2 + 5 
		// 5=++
		System.out.println(x+=2); //5 >> 위에서 ++이 더해지지않은 채로 여기서 +1돼서 3+2 = 5
		System.out.println( !('A' <= c && c <='Z') ); //false
		//true && true 인데 ! 있어서 반대 false
		System.out.println('C'-c); //0>> 67-65=2
		// 'C' - 'A' >> 정수로 바뀐다
		// 67 - 65 = 2
		// 연산의 결과는 int
		
		System.out.println(c+1); //66 
		//이 더한 값을 C에 저장한게 아니어서 C는 아직 65
		
		System.out.println(c++); //67>> ++적용 ㄴㄴ A
		// A에 하나 증가 시킨 것 + 후치연산이라 >> B
		// 출력한 다음에 증가한다
				
		System.out.println(c);  //67 c값이 위에서 +1돼서 문자 B
		// 앞서 출력한 값에 증가한 값이라 B

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
