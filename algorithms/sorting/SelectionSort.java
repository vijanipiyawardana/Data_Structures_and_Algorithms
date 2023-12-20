import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {

	static ArrayList<Integer> sortArrayList(ArrayList<Integer> arr) {
		int n = arr.size();

		for (int i = 0; i < n - 1; i++) {
		    int minValue = arr.get(i);
		    int minIndex = i;
		    for (int j = i + 1; j < n; j++) {
		        if (arr.get(j) < arr.get(minIndex)) {
		        	minValue = arr.get(j);
		        	minIndex = j;
		        }
		    }
		    if (minIndex != i) {
		        int temp = arr.get(i);
		        arr.set(i, arr.get(minIndex));
		        arr.set(minIndex, temp);
		    }
		}
		
		return arr;
	}
	
	static void printArrayList(ArrayList<Integer> arr, String msg) {
		System.out.println(msg + "ArrayList is: ");
		for (Integer num: arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	static int[] sortArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
		    int minValue = arr[i];
		    int minIndex = i;
		    for (int j = i + 1; j < n; j++) {
		        if (arr[j] < arr[minIndex]) {
		        	minValue = arr[j];
		        	minIndex = j;
		        }
		    }
		    if (minIndex != i) {
		        int temp = arr[i];
		        arr[i] = arr[minIndex];
		        arr[minIndex] = temp;
		    }
		}
		return arr;	
	}
	
	static void printArray(int arr[], String msg) {
		System.out.println(msg + "Array is: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
	
		// as an array
		int arr[] = { 6, 2, 8, 5, 1 };

		printArray(arr,  "Before sorting - ");
		int sortedArr[] = sortArray(arr);
		printArray(sortedArr, "After sorting - ");
		
		// as an arrayList
		ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(6, 8, 3, 9, 4, 1, 7));
    		
   		printArrayList(integerList, "Before sorting - ");
		ArrayList<Integer> sortedIntegerList = sortArrayList(integerList);
		printArrayList(sortedIntegerList, "After sorting - ");
		
	}
}
