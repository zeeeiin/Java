package Quiz12;

public class Radio extends Product { //기본생성자때문에 빨간 줄 생기는 것
	

	//Radio는 생성자가 1개 있고, 가격은 300원, 이름은 마음대로!
	public Radio() {
		super(300, "sony"); //첫번째 줄은 슈퍼 키워드로 부모 생성자와 연결시켜줘야한다. 이게 중요!
	}	
	
}
