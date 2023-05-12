package Day08.super_;

public class Child extends Parent {

//	Child(){
//		super(); 생략되어 있는 상태이긴한에 얘때문에 문법적 오류로 빨간줄이 생긴것
	
	//부모님의 기본 생성자가 없을 때 해결방안 2가지
	//1. 부모님의 기본생성자를 만든다. >> 이것보단 2번을 쓰자.
	//2. 자식에서 super()통해서 부모님의 생성자와 강제 연결한다.
	
	String me;
	
	Child(String me){ //이름만 받을 것
//		super(); 
		super("홍순자", "홍길동"); //부모님의 알맞은 생성자가 연결돼서 빨간줄이 사라짐	
		this.me = me;
	}
}
