package Day11.inter.basic3;

public class LG implements Printed {

	private String logo = "Life is good";
	@Override
	public void print(String document) {
		System.out.println(logo);
		System.out.println(document);
	}

	@Override
	public void colorPrint(String document, String color) {
		System.out.println(logo);
		System.out.println("color:" + color);
		System.out.println(color + "색상:" + document);
	}

	@Override
	public int copy(int n) { //한 번 반복 돌릴 것
		
		for(int i = 0; i <n; i++) {
			System.out.println(i + "장 복사ing");
		}
		
		return 1; //완료시 1반환
	}

}
