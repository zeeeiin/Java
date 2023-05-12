package Day11.inter.basic2;

public class Dog extends Animal implements IPet {

	@Override 
	public void eat() {
		System.out.println("강아지는 사료를 먹어요");
		
	}

	@Override
	public void play() {
		System.out.println("강아지는 나랑 놀아요");
	}
}
