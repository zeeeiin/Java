package Quiz14;

public class Marine extends Unit {
	
	/*
	마린은 attack = 6이고, armor가 0 입니다.
	단, 모든 마린은 똑같은 공격력과 똑같은 방어력을 가져요.

	*/
	
	public static int attack = 6;
	public static int armor = 0; 
	
	/*
	마린은 생성될때 좌표는 0, 체력은 60은로 생성됩니다.
	*/	
	
	public Marine(){ //Unit 생성자로 연결이 들어가면 되니까 super로 연결
		super(0, 0, 60);
	}	
	

	/*
	 * location()의 기능
	 * 마린의 현재위치 x, y의 출력
	 */
	
	@Override
	public void location() {	
		System.out.println("x:" + getX() + ", y:" + getY());		
	}
	
	
	/*
	 * move()의 기능
	 * 1. 현재좌표값에서 매개변수의 좌표만큼 이동한 거리를 구한다
	 *    루트 근사값은 Math.sqrt(제곱근)을 이용하면 됩니다    
	 * 2. 현재 좌표값을 매개변수의 좌표값으로 변경
	 * 3. 이동한 거리를 정수형으로 출력
	 * 4. location() 메서드를 호출   
	 */
	
		
	@Override
	public void move(int x, int y) {
	
		//제곱근의 합. = 현재위치에서 x값 빼주기
		//어디서 빼든 현재위치에서 이동거리를 뺀다는 의미
		int len =  (getX() -x ) * (getX() - x) + (getY() - y ) * (getY() - y);
		
		//여기에 루트를 씌우면 됨. 이게 거리
//		double distance = Math.sqrt(len); //반환이 더블이긴한데 여기서 캐스팅해줘도 되니 아래처럼 써주기.
		int distance = (int)Math.sqrt(len);
		
		
		//매개변수의 좌표값
		setX(x);
		setY(y);		
		
		System.out.println("distance:" + distance);
		
		location();
	}


}
