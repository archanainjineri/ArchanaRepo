import java.util.HashMap;


public class CopyOfTwoSum {
	public static void main(String[] args){
		//int[] A = {2,7,11,15};
		int[] A= {-555,879,-20,8,55,120};
		int target = 9;
		
		int[] C = getTwoSum(A,target);
		for (int i =0 ;i< C.length ; i++){
			System.out.println(C[i]);
		}
		
	}

	public static int[] getTwoSum(int[] A, int target ){
		int[] B=new int[2];
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i =0 ;i< A.length ; i++){
			if(map.containsKey(A[i])){
				int index = map.get(A[i]);
				B[0] = index;
				B[1] = i;	
				break;
			}
			else{
				map.put(target-A[i], i);
			}
		}
		return B;
	}
}
