package Day11.inter.basic2;

public class GoldFish extends Fish implements IPet {
//fish 타입만 생성하면 fish 기능만 사용가능
	@Override
	public void swim() {
		System.out.println("금붕어는 어항에서 헤엄쳐요");
	}

	@Override
	public void play() {
		System.out.println("금붕어는 혼자 놀아요");
	} 	
	

}
