package kr.co.ca;

import com.naver.UserRunnable1;

public class MainEx3 {

	public static void main(String[] args) {
		System.out.println("main start");
		UserRunnable1 ur1 = new UserRunnable1();
		//3. UserRunnable Class���̿� runnable ��ü ����
		Thread urt1 = new Thread(ur1);
		//4. Thread Class �̿� Thread ��ü ����(runnable ��ü�� parameter�� �ѱ��.)
		urt1.start();
		//5. thread ��ü�� ���� �ִ� start() method ȣ��
		System.out.println("main end");
	}

}
