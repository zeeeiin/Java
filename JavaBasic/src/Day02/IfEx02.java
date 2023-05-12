package Day02;

import java.util.Scanner;

public class IfEx02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		System.out.println("점수 입력>");
		int point = scan.nextInt(); //정수입력
		
		//점수별로 하나씩 지정
		if(point >=90) {
			//자세하게 점수를 나누고 싶은 경우
			//95점 이상, 이하인 경우로 나누려면
			if(point >= 95) {
				System.out.println("A+ 학점");			
			} else { //90<= x < 95 암묵적으로 이 조건이 된다
				System.out.println("A학점");				
			}		
			
			System.out.println("상위 10프로네요!");
			
			
			
		} else if( point >=80 ) { //범위를 디테일하기 정하지 않더라도 알아서 90미만으로 걸러짐
			System.out.println("B학점");			
		} else if( point >=70) {
			System.out.println("C학점");
		} else if( point >=60) {
			System.out.println("D학점");
		} else {
			System.out.println("재수강");
		}
		
		
	}
}
