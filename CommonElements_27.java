package com.web.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElements_27 {

	public static void main(String[] args) {
		  List<Integer> list1 = new ArrayList<>();
	        list1.add(1);
	        list1.add(2);
	        list1.add(3);
	        list1.add(4);
	        list1.add(5);

	        List<Integer> list2 = new ArrayList<>();
	        list2.add(3);
	        list2.add(4);
	        list2.add(5);
	        list2.add(6);
	        list2.add(7);

	        List<Integer> commonElements = findCommonElements(list1, list2);
	        System.out.println("Common Elements: " + commonElements);
	    }

	    public static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
	        Set<Integer> set = new HashSet<>(list1);
	        set.retainAll(list2);
	        return new ArrayList<>(set);
	}

}
