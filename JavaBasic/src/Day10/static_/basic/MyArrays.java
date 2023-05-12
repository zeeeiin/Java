package Day10.static_.basic;

public class MyArrays {

	/*
	 * Arrays클래스의 toString 메서드 똑같이 만들기
	 * 
	 * 1. 외부에서 객체 생성하지 못하도록 생성자에 접근제어자를 붙인다.
	 * 2. printArray() 생성하는데, 배열을 매개변수로 받아서 toString 처럼
	 * 	  리턴되도록 메서드 오버로딩 (String) (int) (char)
	 * 
	 */
	
	private MyArrays() {} //밖에서 못 만들게 접근제어자 private 붙여주기. 개체생성 불가
	
	//메서드 생성 밖에서 호출하기 위해 퍼블릭 스태틱
	public static String printArray(String[] arr) { //접근제어자 + 정적제어자
		
		String str = "[";
		for(int i = 0; i < arr.length; i++) {
	
			str += arr[i]; //요소 붙이고
			if(i == arr.length - 1) { //마지막 조건
				return str += "]"; //콤마 안 붙이고 끝내겠다
			}
			str += ", "; //콤마 붙이고	
		}
		str += "]";
		
		return str;
	}
	
	
	
	public static String printArray(int[] arr) { //접근제어자 + 정적제어자
		
		String str = "[";
		for(int i = 0; i < arr.length; i++) {
	
			str += arr[i]; //요소 붙이고
			if(i == arr.length - 1) { //마지막 조건
				return str += "]"; //콤마 안 붙이고 끝내겠다
			}
			str += ", "; //콤마 붙이고	
		}
		str += "]";
		
		return str;
	}
	
	
	
	public static String printArray(char[] arr) { //접근제어자 + 정적제어자
		
		String str = "[";
		for(int i = 0; i < arr.length; i++) {
	
			str += arr[i]; //요소 붙이고
			if(i == arr.length - 1) { //마지막 조건
				return str += "]"; //콤마 안 붙이고 끝내겠다
			}
			str += ", "; //콤마 붙이고	
		}
		str += "]";
		
		return str;
	}
	

}
