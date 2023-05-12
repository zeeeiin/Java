package Day11.inter.basic2;

public class PetHouse {

	//공유하기 싫다면 static 붙여주기
	public static void carePet(IPet pets) { //매개변수에 인터페이스타입 선언 가능
						//이제 여기에 들어올 수 있는 타입은 dog cat goldfish
		//형변환 넘어오는 펫타입을 instanceof로 확인해주기
		if(pets instanceof Dog) { //넘어오는 pets객체가 Dog를 가지고 있다면 Dog로 잘라서(형변환해서) 내가 사용하겠다
			
			Dog dog = (Dog)pets;
			dog.play();
			
		} else if(pets instanceof Cat) {
			
			Cat cat = (Cat)pets;
			cat.play();			
			
		} else if(pets instanceof GoldFish) {
			
			GoldFish fish = (GoldFish)pets;
			fish.play();			
		}
		
	}
	
}
