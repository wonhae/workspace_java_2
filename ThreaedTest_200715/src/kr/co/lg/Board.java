package kr.co.lg;

public class Board {

	private String content;
	
	boolean isOk = false;//setcontent ����� true�� ����
	
	public String getContent() {
		if (!isOk) {
			try {
				synchronized (this) {
					wait();	//Object class�� method wait()
							//try-catch�۾����� �ݵ�� ����ȭ �۾��� ���ľ� �Ѵ�.
							//notify() or notifyAll() ȣ��� ����  ����ϴ� method
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} 		
		
		return content;
	}

	public void setContent(String content) {
		isOk = true;
		
		synchronized (this) {
			notifyAll();
		}	//wait�� ���� key�� ����ȭ�۾��� �ؾ� �Ѵ�.
		
		this.content = content;
	}
	

}
