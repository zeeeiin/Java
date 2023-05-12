package Quiz19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapQuiz01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//맵을 이용하는데 key : 메뉴이름  value: 가격
		Map<String, Integer> map = new HashMap<>();

		while(true) {

			System.out.println("-----음식 메뉴 관리------");
			System.out.println("1. 신규 메뉴 등록"); //이미 등록된 메뉴인지 확인 후에 메뉴 등록
			System.out.println("2. 메뉴판 전체 보기"); //메뉴와 가격을 전부 출력
			System.out.println("3. 메뉴판 수정"); //변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정
			System.out.println("4. 메뉴판 삭제"); //변경할 메뉴를 받아서 메뉴가 있다면 삭제
			System.out.println("5. 프로그램 종료"); //종료

			System.out.print("메뉴입력>");
			int menu = scan.nextInt();			

			if(menu == 1) {

				System.out.print("메뉴를 입력하세요 > ");
				String name = scan.next();
				System.out.print("가격을 입력하세요 > ");
				int price = scan.nextInt();
				
				if( map.containsKey(name)) { //있다면 true, 없으면 false
					System.out.println("이미 존재하는 메뉴입니다.");
				} else {
					map.put(name, price);
					System.out.println("정상 입력되었습니다.");
					
				}
			} else if(menu == 2) { //메뉴판 전체 보기
				//키만 뽑아서 사용하는 방법
				//Set<Entry<String,Integer>> entrySet = map.entrySet(); 
				//우항에 있는걸 Set에 넣어주는 것
				
				//Iterator<Entry<String, Integer>> iter= entrySet.iterator();
				//iter를 반복으로 돌려주면 String, Integer가 나온다?
				//사실 이 iterator까진 안 써도 되고 entrySet.iterator를 반복시키면 된다
				
				//개인적으론 이 부분이 아직 이해가 잘 안감
				for(Entry <String, Integer> entry : map.entrySet()) {
					System.out.println("메뉴:" + entry.getKey() + ", 가격:" + entry.getValue());//key == 메뉴
				}
				
			} else if(menu == 3) { // 메뉴판 수정

				System.out.print("수정할 메뉴 > ");
				String name = scan.next();

				if(map.containsKey(name)) {
					System.out.print("수정할 가격 > ");
					int price = scan.nextInt();
					
					map.put(name, price);
					System.out.println("수정되었습니다.");
				} else {//메뉴가 없는 경우					
					System.out.println("메뉴가 존재하지 않습니다.");					
				}
				
			} else if(menu == 4) { //삭제

				System.out.print("삭제할 메뉴 > ");
				String name = scan.next();

				Integer x = map.remove(name);
				
				if(x != null) { //contains key 로 해도 된다.					
					System.out.println("메뉴가 삭제되었습니다.");
				} else {
					System.out.println("메뉴가 없습니다.");
				}

			} else if(menu == 5) {
				System.out.println("프로그램을 종료합니다");
				break;			
			}

		}


	}
}
