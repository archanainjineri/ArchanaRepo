package serviceNow;

public class UnionOfArray {
	
  void getUnion(int[] a1, int[] a2, int m , int n){
	  int i = 0, j=0;
	  while(i< m && j < n ){
		  if( a1[i] < a2[j] )
			  System.out.println(a1[i++]);
		  else if( a2[j] < a1[i])
			  System.out.println(a2[j++]);
		  else{
			  System.out.println(a1[i++]);
			  j++;
		  }
		  
	  }
		
	}

	public static void main(String[] args) {
		 int[] arr1 = {1, 3, 4, 5, 7};	
		 int[] arr2 =  {2, 3, 5, 6};
		 
		 UnionOfArray obj = new UnionOfArray();
		 obj.getUnion(arr1, arr2, arr1.length, arr2.length);
		 

	}

}	

