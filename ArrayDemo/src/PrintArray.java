
public class PrintArray {

	public static void main(String[] args){
		
		int A[] = { 1,2,3};
		int i = 0;
		while(i < A.length){
			int j = i;
			while( j < A.length){
			System.out.println(A[i]+"-"+A[j]);
			j++;
			}
			i++;
		}
	}
}
