package Quiz19;

import java.util.*;

public class ListQuiz02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<User> list = new ArrayList<>(); //배열 대체

	
		while(true) {

			System.out.println("[1.등록 | 2.회원정보확인 | 3.회원정보 검색 | 4.회원정보삭제 | 5.프로그램종료]");

			System.out.println("메뉴(번호)>");

			int menu = scan.nextInt();

			//if문으로 대체 가능
			switch (menu) {
			case 1 :
				//이름, 나이를 입력받아 User객체에 저장, 리스트에 순서대로 추가.
			
				System.out.print("이름 입력>");
				String name = scan.next(); //이름 받기
				System.out.print("나이 입력>");
				int age = scan.nextInt(); //나이 받기

				User u = new User(name,age); //user 객체로 입력받은 이름과 나이 받아주기
				list.add(u); //리스트에 저장	
				System.out.println("정상 입력 되었습니다.");

				break;

			case 2 :
				//리스트에 담긴 모든 회원 이름, 나이를 출력.
				
				//순회시 향상된 for문 사용해보자
				//list 요소를 하나씩 빼주는 것
				
				//순서대로 반복할 때만 사용.
				for( User ul : list) { //list의 제네릭 타입으로 받는 것. 삭제할 땐 사용하면 안 됨.
					//list.get()을 향상된 for문이 대신 해주는 것
					System.out.println( ul.getName() + ", " + ul.getAge() );
				}

				break;
				
			case 3 :
				//찾을 이름을 새롭게 입력받아서, 이름이 있다면, 이름과 나이를 출력.
				//조건 - 찾는 이름이 없다면 "***은 목록에 없습니다" 출력
				
				//리스트에 있는 객체 정보(이름,나이)를 get메서드로 꺼낼 것.
				
				System.out.print("찾을 이름을 입력하세요 > ");		
				String name2 = scan.next(); //새로운 이름 입력받기
				
				boolean bool = true;
				
				for(int i = 0; i < list.size(); i++) {

					User us = list.get(i); //list의 get함수 i번째를 꺼낼 것. user 와 비교하기 위해 꺼내는 것
					//get 함수는 인덱스번째를 반환해준다 (get은 리턴(반환)이 있다.)
					//반환 타입에 맞춰 적어주기 (User)
					//get 메서도 한 번 더 꺼내줘야함
					
					String n = us.getName(); //name2와 n을 비교할 것.					
					
					if( name2.equals(n)) { //입력받은(찾는) 이름 == 리스트에 있는 이름
						System.out.println( "이름:" + us.getName() + "  나이:" + us.getAge());
						//조건을 만족하는 경우 출력.
						bool = false; //실행했음 이라는 신호
						break; 
					} 
					if(bool) {
						System.out.println("찾는 이름은 없습니다");
					}
				}  
				break;

			case 4 :
				//삭제할 이름을 입력받아서, 이름과 동일한 User 객체를 1개(첫번째)만 삭제

				System.out.print("삭제할 이름을 입력하세요 > ");
				String delete = scan.next();
				
				for(int i = 0; i < list.size(); i++) {
					
					User us2 = list.get(i);					
					String n = us2.getName(); //객체 이름 꺼내기. 반환받을 타입+변수이름.
					if( delete.equals(n)) { //리스트에 있는 (확인할이름)과 입력받은 이름이 같은지
						list.remove(i);
						break;
					}			
				}
				break;
			case 5 :
				System.out.println("프로그램 종료");
				System.exit(0); //리턴 써도 됨
				break;

			default:
				break;
			}





		}

	}


}
