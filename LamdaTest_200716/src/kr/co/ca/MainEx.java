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
		Cat c = (int a) -> {  //�߰�ȣ ���̴�  me2 �޼��� �ǹ� 
			System.out.println("Cat Lamda: "+ a);
		};
		c.me2(20);
		
		
		System.out.println("::::::::::::::::::::::::::");
		//2 CatImpl Ŭ���� ���� �����.
		Cat c2 = new CatImpl();
		c2.me2(5);
		
		
		//1
		Cat c1 = new Cat() { //�͸�ü ���鶧 ���� ���� ������� �ʴ´�. 

			@Override
			public void me2(int a) {
			System.out.println("cat");
			}
		};
		c1.me2(10);
		
		
		
		//3 ���ٽ� 
		Dog d = () -> { //dog��� �������̽� ��� �������̵� �Ұ��ΰ�?
			System.out.println("Dog �������̽��� me1()�޼��� �������̵�");			
		};
		d.me1();
		
		
		System.out.println(":::::::::::::::::::::::::::");
		
		
		//2 Dog class�� �����ϴ� �� �����  
		class DogIMpl implements Dog{ //�޼��� �ȿ��� ������ Ŭ���� : ���ó���Ŭ���� ->���ȿ� ������ ��� / �� Ŭ������ ��ŷ�Ұ�  

			@Override
			public void me1() {
			}
		}
		Dog d2 = new DogIMpl();  //����ü�� �̿��� ��ü�����
		d2.me1();  //����ü����� �޼��� ȣ��
		
		
		
		
		//1
		Dog d1 = new Dog() { //�������� �ʴ� �߻�޼��� ������ �������̽��ε� ��ü ���� �� �ִ�. (); �ٷ� �� ����� 
			
			@Override
			public void me1() {
			}
		};
		d1.me1();
		
		
		
		
		
	}
}
