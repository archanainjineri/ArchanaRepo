
public class RemoveDuplicates {
	public static void main(String[] args){
		int[] A = {1,2,2,2,2,2,2,3,3};
		int count = removeDuplicates(A);
		printArray(A);
	}
	
	public static void printArray(int[] A){
		for (int i=0; i<A.length; i++){
			System.out.print(A[i] + " ");
		}
	}

	public static int removeDuplicates(int[] A){
		
		int j = 0;
		int i = 1;
		while( i < A.length){
			if (A.length <= 1)
				return A.length;
			if(A[j] == A[i])
				i++;
			else{
				j++;
				A[j] = A[i];
				i++;
			}
		}
		return j+1;
	}
}
