package kr.co.ca;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class MainEx2 {
	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(5);
		set.add(500);
		set.add(3);
		set.add(11);
		System.out.println("*********************");
		
		//���ٽ�  iterator �Ƚᵵ �ȴ�!! 
		//List<Integer> list = new ArrayList<Integer>();  //�ܺο��� ����ϰ� ������!!! 
		set.forEach(x ->{
			System.out.println(x);
			//list.add(x);
		});
		//System.out.println(list.get(0));
		
		System.out.println(":::::::::::::::::::::");
		//set���� �����ö� iterator �����
		Iterator<Integer> it = set.iterator();
		//List<Integer> list = new ArrayList<Integer>(); list ������ �̷��� �ִ´�. 
		
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.println(integer);
			//list.add(integer);
		}
		//System.out.println(list.get(0));
		
	}
}
