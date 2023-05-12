package Day10.abstract_.bad;

public class SeoulStore extends Store { //상속받음
	
	//오버라이딩 시도
	public void apple() {
		System.out.println("서울지점 사과는 500원");
	}
	
	public void grape () {
		System.out.println("서울지점 포도는 600원");
	}
	
	public void orange () {
		System.out.println("서울지점 오렌지는 700원");
	}

	//과일을 더 추가해야했는데 과일 3개만 오버라이딩하고 실행해보면...
	
}
