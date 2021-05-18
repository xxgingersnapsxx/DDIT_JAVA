package chapter7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Exercise61 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(5);
		list1.add(4);
		list1.add(3);
		list1.add(2);
		list1.add(1);
		list1.add(1);
		for (int i = 0; i < list1.size(); i++) {
			Integer integer = list1.get(i);
		}
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(5);
		set1.add(4);
		set1.add(3);
		set1.add(2);
		set1.add(1);
		set1.add(1);
		for (Iterator iterator = set1.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
		}
		Iterator<Integer> iterator = set1.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
		}
		for (Integer integer : set1) {
			
		}
	}
}





