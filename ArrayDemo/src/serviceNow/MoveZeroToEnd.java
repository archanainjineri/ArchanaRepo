package serviceNow;

public class MoveZeroToEnd {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 0, 0, 0, 3, 4, 0, 5, 0 };
		int max = arr.length;

		for (int i=0; i<arr.length ; i++){
		System.out.print(arr[i] + " ");
		}	
		for (int i = 0,j = 0; j < max; j++) {
		  if (arr[j] != 0) {
		    if (i < j) {
		      swap(arr, i, j);
		    }
		    i++;
		  }
		}
		System.out.println();
		for (int i=0; i<arr.length ; i++){
			System.out.print(arr[i] + " ");
			}
	}
	public  static void swap(int[] a, int x, int y){
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

}
