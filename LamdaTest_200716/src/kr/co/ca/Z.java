package kr.co.ca;

import com.naver.Turtle;
import com.naver.TurtleImpl;

public class Z {
	public static void main(String[] args) {
		
		
		Turtle t3 = (String a, int b) -> {
			
		};
		t3.me3("hihi", 10);
		
		class TurtleImpl implements Turtle{

			@Override
			public void me3(String str, int c) {
				// TODO Auto-generated method stub
				
			}

		}
		Turtle t2 = new TurtleImpl();
		t2.me3("hi", 6);
		
		
		Turtle t1 = new Turtle() {
			
			@Override
			public void me3(String str, int c) {
				// TODO Auto-generated method stub
				
			}
		};
		t1.me3("hello", 3);
		
		
		
		
	}
}
