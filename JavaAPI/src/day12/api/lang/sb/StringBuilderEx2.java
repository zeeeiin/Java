package day12.api.lang.sb;

public class StringBuilderEx2 {
	
	public static void main(String[] args) {
		
		//문자열과 향상된 문자열과의 차이
		/*
		long start = System.currentTimeMillis();
				
		String str = "A";
		for(int i = 1; i <= 300000; i++) {
			str = str + "A"; //문자열 더하기
		}
		*/
		long start = System.currentTimeMillis();
		
		StringBuilder sb = new StringBuilder("A");
		
		for(int i = 1; i <= 300000; i++) {
			sb.append("A"); //새로운 객체 없이 이어나가서 수행시간이 매우 빠르다
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("수행시간:" + (end - start) * 0.001);
		
	}

}
