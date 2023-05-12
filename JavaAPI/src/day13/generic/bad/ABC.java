package day13.generic.bad;

public class ABC {

	//제네릭이 없다면?
	//ABC를 뭐든 저장할 수 있는 클래스로 만들고 싶다
	private Object obj; //obj 타입 생성
	
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	public Object getObj() { //반환유형이 들어가야해서 obj가 들어감
		return obj;
	} //이제 abc는 모든 걸 다 담을 수 있는 obj 클래스가 되었다
	
	
	
}
