
public class Variables {
	
	int iv = 0;   // 인스턴스 변수
	static int cv = 0;  // 클래스 변수(static변수, 공유변수)
	
	
	void method() {
		int lv = 0;  // 지역변수
	}
	
}	
//	변수의 종류						선언위치				생성시기
/*
	클래스변수(class)				클래스영역				클래스가 메모리에 올라갈 때
	인스턴스변수(instance)			클래스영역				인스턴스가 생성되었을 때
	지역변수(local)				클래스 영역 이외의 영역		변수 선언문이 수행되었을 때
								(메서드, 생성자)		
*/
		
//인스턴스변수
//클래스 영역에 선언되며, 클래스의 인스턴스를 생성할 때 만들어진다.
//그렇기 때문에 인스턴스 변수의 값을 읽어 오거나 저장하기 위해서는 먼저 인스턴스를 생성해야 한다.
//인스턴스는 독립적인 저장공간을 가지므로 서로 다른 값을 가질 수 있다.
//인스턴스마다 고유한 상태를 유지해야 하는 속성의 경우, 인스턴스변수로 선언한다.


//클래스 변수를 선언하는 방법은 인스턴스변수 앞에 static을 붙이기만 하면 된다
//인스턴스마다 독립적인 저장공간을 갖는 인스턴스변수와 달리, 클래스변수는 모든 인스턴스가
//공통된 저장공간(변수)을 공유하게 된다.
//한 클래스의 모든 인스턴스들이 공통적인 값을 유지해야하는 속성의 경우, 클래스 변수로 선언해야 한다
//클래스 변수는 인스턴스변수와 달리 인스턴스를 생성하지 않고도 언제라도 바로 사용할 수 있는 특징이 있으며,
//'클래스이름.클래스변수'와 같은 형식으로 사용한다.
//예를 들어 Variables클래스의 클래스변수 cv를 사용하려면 'Variables.cv'와 같이 사용하면 된다
//클래스가 메모리에 '로딩'될 때 생성되어 프로그램이 종료될 때 까지 유지되며,
//public을 앞에 붙이면 같은 프로그램 내에서 어디서나 접근할 수 있는 
//전역변수(global variable)의 성격을 갖는다


//지역변수(local variable)
//메서드 내에 선언되어 메서드 내에서만 사용 가능하며, 메서드가 종료되면 소멸되어
//사용할 수 없게 된다.
//for문 또는 while문의 블럭 내에 선언된 지역변수는, 지역변수가 선언된 블럭{}
//내에서만 사용가능하며, 블럭{}을 벗어나면 소멸되어 사용할 수 없게 된다










