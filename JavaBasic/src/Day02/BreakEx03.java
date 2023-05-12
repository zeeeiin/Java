package Day02;

public class BreakEx03 {

	public static void main(String[] args) {
		
		//변수를 사용하는 방법
		//0 또는 1만 표현해주는 변수를 사용해야 한다.
//		boolean flag = false; //탈출을 위한 변수
//		
//		for(char c = 'A'; c <= 'Z'; c++) {
//			
//			for(char l = 'a'; l <= 'z'; l++) {
//				System.out.println(c + "-"+ l);
//				
//				if(l == 'f') { //바깥에선 l 변수 사용 불가 >>변수사용해야함
//					flag = true; //탈출을 위해 true
//					break;
//				}
//			}   //end
//			
//			if(flag) break;	//	
//		} //end
		//		
		
		x:for(char c = 'A'; c <= 'Z'; c++) { //x라는 이름을 붙인것
			
			for(char l = 'a'; l <= 'z'; l++) {
				
				System.out.println(c + "-"+ l);
							
				if(l == 'f') { 					
					break x;//적혀있는 곳까지 완전히 탈출한다.	
			} 	//라벨 방식이라고 한다!			
		}				
		}}}
