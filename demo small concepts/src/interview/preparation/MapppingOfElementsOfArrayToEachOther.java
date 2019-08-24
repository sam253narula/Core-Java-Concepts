package interview.preparation;

/**
 * Map elements of an array to elements of another array. i/p: A[] =
 * {1,5,2,4,4,3} B[]={1,2,5,1} o/p: 0 2 1 NA
 */
import java.util.ArrayList;
import java.util.Arrays;

public class MapppingOfElementsOfArrayToEachOther {
public static void main(String[] args) {
	//Declares an Array of integers inline
	ArrayList<Integer> firstList = new ArrayList<Integer>(Arrays.asList(1, 5, 2, 4, 4, 3));
	ArrayList<Integer> secondList = new ArrayList<Integer>(Arrays.asList(1, 2, 5, 1));
	//Declare an Array to check elements that are already mapped 
	ArrayList<Integer> duplicateCheckList = new ArrayList<>();
	//Accessing the elements of the specified array
	for (int i = 0; i < secondList.size(); i++) {
	for (int j = 0; j < firstList.size(); j++) {
	//Below is the required condition to map elements of secondList to firstList
	if (firstList.get(j) == secondList.get(i) && !duplicateCheckList.contains(secondList.get(i))) {
	duplicateCheckList.add(secondList.get(i));
	System.out.println(j);
	break;
	} 
	else if (duplicateCheckList.contains(secondList.get(i))) {
	System.out.println("NA");
	break;
	}
	}
	}
	}
}
