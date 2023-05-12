package Quiz05;

public class Calculator {

	//부모클래스
	
	
	int result;
	double	pi = 3.14;
		
	void add(int a) {
		result += a;
	}
	
	void sub(int a) {
		result -= a;
	}
	
	double circle(int a) {
		return a * a * pi;
	}
	
	
}
