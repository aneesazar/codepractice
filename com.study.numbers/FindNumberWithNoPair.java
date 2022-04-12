package com.study.numbers;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Find the number in array which doesn't have a pair
 */
public class FindNumberWithNoPair {
	
	public int getNumberWithNoPair(int[] A) {
		
		
		/* 1. Iterate array 
			2. create hashmap store the number is key, occurance as value
			3. return the key with 1 occurance
			4. remove the key if we find second time, so that we can capture the scenarios same number with odd occurances (3,5,..)
		*/
		int result=0;
		Map<Integer,Integer> occuranceMap = new HashMap<>();
		for(int a: A) {
			if(occuranceMap.get(a) != null) {
				occuranceMap.remove(a);
			} else {
				occuranceMap.put(a,1);
			}
		
		}
		
		for(Entry<Integer,Integer> e : occuranceMap.entrySet()) {
			if(e.getValue() ==1) {
				result = e.getKey();
			}
		}
		
		return result;
	}

}
