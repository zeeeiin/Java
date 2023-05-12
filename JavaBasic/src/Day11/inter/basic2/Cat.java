package Day11.inter.basic2;

public class Cat extends Animal implements IPet { //받고싶은걸 뒤에 이어 적어주기

	@Override
	public void eat() {
		System.out.println("고양이는 생선을 먹어요");
	}

	@Override
	public void play() { //play 기능을 오버라이드 할 수 있게 된다
		System.out.println("고양이는 쥐랑 놀아요");
	}

	
}
