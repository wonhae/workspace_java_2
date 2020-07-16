package kr.co.lg;

public class Sum2 {
	public int num1;
	//Critical Section
	
	public int num2;
	public int num3;
	
	Object key1 = new Object();
	Object key2 = new Object();
	Object key3 = new Object();
	
	public void addNum1(int n) {
		synchronized (this) {
			num1 = num1 + n;
		}
		//����ȭ block
		//this �ڸ��� key1�� �־ �ȴ�.(�θ�ü�̱� ������)
	}

	
	public void addNum2(int n) {
		synchronized (key1) {
			num2 = num2 + n;
		}
	}
	//num1�� num2 ���̿��� ����ȭ������ �߻����� �ʴ´�.
	//�̷� ��Ȳ���� synchronized�� key�� this�� ����ϸ� key�� �ϳ��̱⿡ �����ð��� �ɸ��µ�
	//�̷� ��Ȳ�� �ذ��ϱ����� ��ο� key�� ������ �־��شٸ� ���� ���� �۾��� �����ϴ�.
	
	public void addNum3(int n) {
		synchronized (key2) {
			num3 = num3 + n;
		}
	}
	
	public void subNum1(int n) {
		synchronized (this) {
			num1 = num1 - n;
		}
	}
	//key3�̶�� ���ο�Ű�� ����� ������ ����ȭ������ �߻��� ������.
	
	public void subNum2(int n) {
		synchronized (key1) {
			num2 = num2 - n;
		}
	}

}
