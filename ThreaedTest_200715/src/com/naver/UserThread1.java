package com.naver;

public class UserThread1 extends Thread {
	//1. Thread class�� ����ϴ� �ڽ� class ����
	
	
	//2. ����� Thread���� ������ �ڵ带 �ڽ� class�� run() method�� �ۼ�
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
