package Day11.inter.basic3;

public interface Printed {

	//클래스가 구현해야 할 프린트의 기능들..
	void print(String document);
	void colorPrint(String document, String color);
	int copy(int n);
}
