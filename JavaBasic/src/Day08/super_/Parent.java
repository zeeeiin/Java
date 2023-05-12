package Day08.super_;

public class Parent {

	//변수부터 선언
	String mother;
	String father;
	
	
//	Parent(){ //얘도 생략됨
//		super(); //이게 생략됨
//	}
	
	
	Parent(String mother, String father){
		this.mother = mother;
		this.father = father;		
	}
	
	String info() {
		return "name:" + mother + ", name:" + father;
	}
	
	
	
}




