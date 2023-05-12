package day13.generic.good;

public class DEF<T, C> {
	
	//두 타입 다 쓸 수 있다
	private T key;
	private C vaule;
	
	//생성자는 똑같이 만들기
	
	
	
	
	//get, set 생성
	public T getKey() {
		return key;
	}
	public void setKey(T key) {
		this.key = key;
	}
	public C getVaule() {
		return vaule;
	}
	public void setVaule(C vaule) {
		this.vaule = vaule;
	}
	
	@Override
	public String toString() {
		return "DEF [key=" + key + ", vaule=" + vaule + "]";
	}
	

}
