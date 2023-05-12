package quiz01;

public class LottoMain {
	
	public static void main(Month[] args) {
		
		Lotto lo = new Lotto();

		lo.lotto(2, 5, 17);
		lo.getNumber();
		lo.getLottoNum();
		lo.getWin();

		Lotto lo2 = new Lotto();

		lo2.lotto(2, 9, 27);
		lo2.getNumber();
		lo2.getLottoNum();
		lo2.getWin();


	}

}
