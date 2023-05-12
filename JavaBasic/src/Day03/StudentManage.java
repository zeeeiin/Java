package Day03;

import java.util.Arrays;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class StudentManage {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//학생정보를 등록할 배열을 while문 바깥에 선언.
		String[] nameList = new String[100];
		int[] ageList = new int[100];
		String[] infoList = new String[100];
		
		//고객수
		int count = 0; //count에 입력받은 3개의 값을 넣어주고
		//조회할 위치
		int index = -1;
		
		x:while(true) {
			
//			System.out.println(Arrays.toString(nameList));
//			System.out.println(Arrays.toString(ageList));
//			System.out.println(Arrays.toString(infoList));	
			
			
			System.out.println("[정보]고객수:" + count + ", 조회위치:" + index);
			System.out.println("[메뉴]1.추가, 2.이전정보, 3.다음정보, 4.현재정보, 5.정보수정, 6.정보삭제, 7.종료 ");
			System.out.println("======================================================================");
			System.out.print("메뉴입력>");			
			String menu = scan.next();
			
			switch (menu) {
			case "추가":	//추가 또는 1번이면  이걸 실행하겠다
			case "1":
				
				/* 추가:
				 * 이름,성별,간단한정보를 입력받아 각각의 배열에 순서대로 저장될 수 있게 처리한다.
				 * 입력 후 count 증가해야함.
				 * 
				 */
				
					System.out.println("===========사용자정보입력=============");
					System.out.println("이름>");
					String name = scan.next();
//					nameList[count] = scan.next();	//네임리스트의 카운트번째..
					System.out.println("나이>");
					int age = scan.nextInt();
					System.out.println("정보>");
					String info = scan.next();	
					
					nameList[count] = name;
					ageList[count] = age;
					infoList[count] = info;
					
					count++; //cnt 증가					
//					index++; //조회위치도 증가. 근데 나중에 삭제할 경우도 고려해서 index--; 도 해줘야함. 고객/조회 숫자 차이가 나면 이상하니깐..?
					
					
				break;

			case "2":					
				
				/*
				 * 이전정보출력:
				 * 정보출력은 index위치로 출력한다.
				 * 이전정보 출력을 누르면 index를 -1시키고 해당위치에 정보를 출력.
				 * 조건
				 * index가 0보다 작다면, 출력하지 않도록 처리해야한다. 
				 * 
				 */
				
				if(index<=0) {
					System.out.println("<이전 정보가 없습니다>");
				} else {
					index--;
					System.out.println("===========이전 정보==========");
					System.out.println("이름:" + nameList[index]);
					System.out.println("이름:" + ageList[index]);
					System.out.println("이름:" + infoList[index]);						
				}
				
			break;

			case "3":	
				
				/*
				 * 다음정보출력:
				 * 다음출력은 index위치로 출력한다.
				 * 다음정보출력을 누르면 index를 +1시키고 해당위치의 정보를 출력.
				 * 조건
				 * count와 index간에 관계를 생각해서..
				 * count-1보다 index가 크다면, 출력하지 않도록 처리. (조건이 안나가야한다) 
				 * 카운트가 3(3명이 저장되어있다)인데 인덱스가 2(다음정보)면 다음정보가 없음
				 * 				 
				 */
				
				if(index >= count - 1) { //같거나 커져있으면.. 정보가 안나온다.
					System.out.println("<다음정보가 없습니다>");
				} else {
					index++;
					System.out.println("===========다음 정보==========");
					System.out.println("이름:" + nameList[index]);
					System.out.println("이름:" + ageList[index]);
					System.out.println("이름:" + infoList[index]);
				}
				
				
			break;

			case "4":	
				
				/*
				 * 현재정보출력
				 * index가 가리키고 있는 위치정보를 출력.
				 * 
				 * 조건 - 출력할 수 있는 조건을 생각해서 처리. (어떻게 해야할지 생각해보기..) 
				 * 
				 */
				
				if(index >= 0 && index <= count-1) { //출력이 가능한 조건
					//별다른 작업 없이 현재위치를 찍어주면 된다.
					System.out.println("===========현재 정보==========");
					System.out.println("이름:" + nameList[index]);
					System.out.println("이름:" + ageList[index]);
					System.out.println("이름:" + infoList[index]);
				} else {
					System.out.println("<현재 위치에 회원정보가 없습니다>");
				}
				
			break;

			case "5":	
				
				/*
				 * 정보수정
				 * 새로운 이름, 나이, 정보를 입력받아서
				 * 현재위치를 수정해주면 된다. 
				 * 
				 * 조건 4번과 동일하다.
				 * 
				 */
				//입력을 다시받고 현재 정보를 수정. 수정할 수 있는 조건이 같아야한다.
				
				if(index >=0 && index <= count-1) {
					System.out.println("========현재 정보 수정========");
					System.out.println(index + "번째위치를 수정합니다.");
					
					System.out.println("현재정보:" + nameList[index] + ">"); //현재정보
//					String name = scan.next();
					//name이라고 쓰니 빨간줄이 들어오는 이유 : 맨 위쪽 case1에서 네임변수가 사용중이어서!
					nameList[index] = scan.next(); //사실 이게 수정-값을 받아서 해당인덱스번째로 바꿔준다.
					
					System.out.print("현재정보:"+ ageList[index] + ">");
					ageList[index] = scan.nextInt();
					
					System.out.print("현재정보:"+ infoList[index] + ">");
					infoList[index] = scan.next();
					
				} else {
					System.out.println("<현재 위치에 수정할 정보가 없습니다>");
				}
				
			break;

			case "6":	
				
				/*
				 * 현재정보 삭제.
				 * 현재삭제하려는 index부터 ~~~뒤에 있는 배열요소를 당겨와서 덮어씌운다.
				 * 사람수가 남아있으면 배열이 이상한데 들어갈 수 있기때문에
				 * 사람수를 감소시켜줘야한다.
				 * 
				 * 조건 - 4번과 동일함. 
				 * 출력하는 조건은 인덱스와 ~?~ 사이에 있으면 된다.
				 */
				
				if(index >= 0 &&index <= count-1) { //삭제 가능한 조건
					
					System.out.println("=========정보삭제=========");
					System.out.println(nameList[index] + "님 정보가 삭제되었습니다.");
					
					for(int i = index; i < count -1; i++ ) { //i < nameList.length-1 도 가능
						//count = 100; = length 두 개가 같은 것.
						//98번째까지 돌려야 에러가 안남 
						//마지막 인덱스까지 돌면 에러나니까 -1
						nameList[i] = nameList[i+1];
						ageList[i] = ageList[i+1];
						infoList[i] = infoList[i+1];						
					}
					count--; //사람수를 하나 줄여서 마치 삭제한 것처럼 처리.
				} else {
					System.out.println("<현재 위치에 삭제할 정보가 없습니다>");
				}
				
			break;

			case "7":					
				//while문의 탈출
								
				System.out.println("안녕히 계세요 여러분!");				
				break x;//7번에서 만나면 와일문 탈출을 하는 브레이크.. 
						
			default:
				System.out.println("잘못 입력했습니다");
				break;
			}
			
		}				
	}		
}

