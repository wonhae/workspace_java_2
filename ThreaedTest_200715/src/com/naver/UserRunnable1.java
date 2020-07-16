package com.naver;

public class UserRunnable1 implements Runnable{
	
	private Thread ut1;	//ut1 thread�� �׻� urt thread���� �۾��� ���� ������ �Ϸ��� �Ķ���͸� �̰��� �־��ش�.
	
	//�� thread��ü�� Ư���ϱ� ����  ����ڻ����� ���
	public UserRunnable1() {
	}
	public UserRunnable1(Thread ut1) {
		super();
		this.ut1 = ut1;
	}


	//1. UserThread2 class ���� ��, Runnable Interface ����	
	
	
	//2. run() method�� ����� Thread���� ������ �ڵ带 �ۼ�
	@Override
	public void run() {
	
		if (ut1!=null) {
			try {
				ut1.join();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
		}
		for (int i = 0; i < 10; i++) {
			char c = (char) ('A'+i);
			System.out.println(c);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
}
