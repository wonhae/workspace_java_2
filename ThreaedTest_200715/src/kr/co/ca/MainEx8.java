package kr.co.ca;

public class MainEx8 {
	public static void main(String[] args) {
		//�������� Thread ��� ����
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				//�ʿ��� �ڵ� �ۼ�
				for (int i = 0; i < 10; i++) {
					System.out.println(i);
				}
				
			}
		}).start();
		
		
		
		
	}
}
