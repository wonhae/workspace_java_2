package kr.co.ca;

import com.naver.UserThread1;

public class MainEx2 {
	
	public static void main(String[] args) {
		System.out.println("main start");
		UserThread1 ut1 = new UserThread1();
		//3. �ڽ� class�� �̿��ؼ� thread��ü�� ����
		
		ut1.start();
		System.out.println("main end");
		//4. thread ��ü�� ���� �ִ� start() method ȣ��
	}
	
}
