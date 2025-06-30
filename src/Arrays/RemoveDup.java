package Arrays;

public class RemoveDup {
		
	static void PrintIntArr(int[] arr) {
		for(int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {12, 23, 34, 35, 12, 38, 22, 23};	
		int n = arr.length;
		
		System.out.println("Array before removing duplicates :");
		PrintIntArr(arr);
		
		for(int i =0; i <n ; i++) {
			for(int k = i+1; k < n; k++) {
				if(arr[i] == arr[k]) {
					arr[k] = 0;
				}
			}
		}
		
		
		int end = n - 1, temp ;
		
		for(int i = 0 ; i < end  ; i++) {
			if(arr[i] == 0) {
				while(arr[end] == 0 && i < end) end--;
				temp = arr[end];
				arr[end] = arr[i];
				arr[i] = temp;
			}
		}
		
		System.out.println("Array after removing duplicates :");
		PrintIntArr(arr);
	}
}
