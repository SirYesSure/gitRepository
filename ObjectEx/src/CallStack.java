
public class CallStack {

	void firstMethod() {
		System.out.println("firstMethod() 시작됨");
		secondMethod();
		System.out.println("firstMethod() 종료됨");
	}
	
	void secondMethod() {
		System.out.println("secondMethod() 시작됨");
		thirdMethod();
		System.out.println("secondMethod() 종료됨");
	}
	
	void thirdMethod() {
		System.out.println("thirdMethod() 시작됨");
		System.out.println("thirdMethod() 종료됨");
	}

}
