package Day11.inter.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		Animal dog = new Dog(); //강아지도 동물처럼 사용이 가능하다 = 강아지를 동물 타입에 저장
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		
		Animal[] animals = {dog, cat, tiger}; //animal타입 배열에 각각의 동물 넣을 수 있다
		
		for(Animal ani : animals) {//animal 타입의 ani 
			ani.eat(); //Animal의 기능
		}
		
		//dog, cat은 Interface타입으로 형변환이 된다.
		//dog, cat, goldfish를 저장하고 IPet의 기능을 사용하고 반복문을 돌리시오.
		
		IPet[] pets = new IPet[3]; //인터페이스타입을 담을 수 있는 배열
		
		
		//pets[1] = (IPet)tiger;  //tiger는 IPet의 기능이 없기때문에 error
		pets[0] = (IPet)dog; //dog는 펫타입을 가질 수 없으니까 캐스팅해줘야함		
		pets[1] = (IPet)cat;
		pets[2] = new GoldFish(); // 자동 형변환이 된 goldfish
		
		//이렇게 담고나서 반복문 돌리기
		for(IPet p : pets) {
			p.play(); //해당 타입이 가진 형태로만. play만 사용 가능하다
		}
		
		System.out.println("---------------------------");
		
		PetHouse.carePet( (IPet)dog );   //dog가 현재 애니멀이라서 그냥 dog만 입력하면 에러나서 형변환시켜줘야한다
		PetHouse.carePet( (IPet)cat);
		PetHouse.carePet( pets[2]); //금붕어는 형변환이 필요없으니까
		
	}
}
