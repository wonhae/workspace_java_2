package kr.co.ca;

import com.naver.Cat;
import com.naver.CatImpl;
import com.naver.Dog;
import com.naver.Turtle;
import com.naver.TurtleImpl;

public class MainEx {
	public static void main(String[] args) {
		
		
		Turtle t3 = (String sr, int d) -> {
			for(int i = 0; i < d ; i ++) {
				System.out.println(sr);
			}
		};
		t3.me3("hi", 5);
		
		
		Turtle t2 = new TurtleImpl();
		t2.me3("world", 20);
		
		
		Turtle t1 = new Turtle() {
			@Override
			public void me3(String str, int c) {
				System.out.println(str + c);
			}
		};
		t1.me3("hello", 10);
		
		
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		//lamda
		Cat c = (int a) -> {  //중괄호 사이는  me2 메서드 의미 
			System.out.println("Cat Lamda: "+ a);
		};
		c.me2(20);
		
		
		System.out.println("::::::::::::::::::::::::::");
		//2 CatImpl 클래스 따로 만든다.
		Cat c2 = new CatImpl();
		c2.me2(5);
		
		
		//1
		Cat c1 = new Cat() { //익명객체 만들때 빼곤 거의 사용하지 않는다. 

			@Override
			public void me2(int a) {
			System.out.println("cat");
			}
		};
		c1.me2(10);
		
		
		
		//3 람다식 
		Dog d = () -> { //dog라는 인터페이스 어떻게 오버라이딩 할것인가?
			System.out.println("Dog 인터페이스의 me1()메서드 오버라이딩");			
		};
		d.me1();
		
		
		System.out.println(":::::::::::::::::::::::::::");
		
		
		//2 Dog class를 구현하는 것 만들기  
		class DogIMpl implements Dog{ //메서드 안에서 생성된 클래스 : 로컬내부클래스 ->보안에 굉장히 우수 / 이 클래스는 해킹불가  

			@Override
			public void me1() {
			}
		}
		Dog d2 = new DogIMpl();  //구현체를 이용해 객체만들고
		d2.me1();  //구현체만들어 메서드 호출
		
		
		
		
		//1
		Dog d1 = new Dog() { //구현되지 않는 추상메서드 구현시 인터페이스로도 객체 만들 수 있다. (); 바로 점 안찍고 
			
			@Override
			public void me1() {
			}
		};
		d1.me1();
		
		
		
		
		
	}
}
