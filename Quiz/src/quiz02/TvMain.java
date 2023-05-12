package quiz02;

public class TvMain {
	
	public static void main(String[] args) {
		
		Tv tv = new Tv(); //생성자를 안 만들었기 때문에 기본 생성자로 만들어주기
		
		tv.power();
		tv.changeChannel(10);
		tv.power();
		
		
		
		
}
}