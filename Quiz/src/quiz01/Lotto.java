package quiz01;
import java.util.Arrays;
public class Lotto {

	Lotto(){}


	//생성된 번호 확인
	int number;

	//당첨 번호 생성
	int lottoNum;

	//등수 확인
	int win;

	//당첨 로또 번호 배열
	int[] lotto = new int[6];

	//내가 구매한 복권 번호 배열
	int[] mybingo = new int[6];


	//로또 구매(번호 생성)
	public void lotto(int a, int b, int c) {

		//내가 적는 로또 번호 3개
		mybingo[0] = a;
		mybingo[1] = b;
		mybingo[2] = c;

		//1000원어치 로또 번호.지정한 번호가 있어서 3번째 위치부터 시작해야함.
		for(int i = 3; i < mybingo.length; i++) {
			mybingo[i]= (int)(Math.random() * 45) + 1;			

			//중복 제거
			for(int j = 3; j < i; j++) {
				if(mybingo[i] == mybingo[j]) {
					i--;
					break;
				}
			}
		}
	}

	//구매한 로또 번호 확인
	public void getNumber() {
		System.out.println("구매한 로또 번호 : " + Arrays.toString(this.mybingo));
	}


	//당첨 로또 번호 생성
	public void getLottoNum() {

		for(int i = 0; i < lotto.length; i++) {
			lotto[i]= (int)(Math.random() * 45) + 1;			

			//중복 제거
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println("이번 주 로또 번호 : " + Arrays.toString(this.lotto));
	}


	//당첨 확인
	public void getWin() {

		int count = 0;

		for(int i = 0; i < this.mybingo.length; i++) {
			for(int j = 0; j < lotto.length; j++) {
				if(this.mybingo[i] == lotto[j]) {
					count++;
				}
			}
		}

		switch (count) {
		case 6:
			System.out.println("1등 당첨입니다! 축하합니다!");
			break;
		case 5:
			System.out.println("2등 당첨입니다! 축하합니다!");
			break;
		case 4:
			System.out.println("3등 당첨입니다! 축하합니다!");
			break;			
		case 3:
			System.out.println("4등 당첨입니다! 축하합니다!");
			break;
		default:
			System.out.println("꽝입니다! ^___^");
			break;
		}

		System.out.println("--------------------------------------------");

	}

}


