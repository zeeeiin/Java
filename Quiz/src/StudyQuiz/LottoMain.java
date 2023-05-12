package StudyQuiz;

public class LottoMain {

	public static void main(String[] args) {

		Lotto lo = new Lotto();

		lo.lotto(3, 17, 23);
		lo.getNumber();
		lo.getLottoNum();
		lo.getWin();

		Lotto lo2 = new Lotto();

		lo2.lotto(7, 19, 43);
		lo2.getNumber();
		lo2.getLottoNum();
		lo2.getWin();

	}

}
