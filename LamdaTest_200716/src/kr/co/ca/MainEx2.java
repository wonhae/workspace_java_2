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
		
		//람다식  iterator 안써도 된다!! 
		//List<Integer> list = new ArrayList<Integer>();  //외부에서 사용하고 싶을때!!! 
		set.forEach(x ->{
			System.out.println(x);
			//list.add(x);
		});
		//System.out.println(list.get(0));
		
		System.out.println(":::::::::::::::::::::");
		//set에서 가져올때 iterator 사용함
		Iterator<Integer> it = set.iterator();
		//List<Integer> list = new ArrayList<Integer>(); list 넣을땐 이렇게 넣는다. 
		
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.println(integer);
			//list.add(integer);
		}
		//System.out.println(list.get(0));
		
	}
}
