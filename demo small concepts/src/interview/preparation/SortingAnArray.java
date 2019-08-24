package interview.preparation;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *Given an array A[] consisting 0s, 1s and 2s, write a function that sorts A[].
 *The functions should put all 0s first, then all 1s and all 2s in last.
 *Examples:
	Input :  {0, 1, 2, 0, 1, 2}
	Output : {0, 0, 1, 1, 2, 2}
 */
public class SortingAnArray {
public static void main(String[] args) {
	ArrayList<Integer> nonSortedList = new ArrayList<>(Arrays.asList(0, 1, 2, 0, 1, 2));
	ArrayList<Integer> SortedLList = new ArrayList<>();
	for(int i = 0;i < nonSortedList.size();i++) {
		if(nonSortedList.get(i) > nonSortedList.get(i+1)) {
			
		}
	}
	
}
}
