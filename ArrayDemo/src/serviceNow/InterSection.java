package serviceNow;


public class InterSection {
	
  void getUnion(int[] a1, int[] a2, int m , int n){
	  int i = 0, j=0;
	  while(i< m && j < n ){
		  if( a1[i] < a2[j] )
			  i++;
		  else if( a2[j] < a1[i])
			 j++;
		  else{
			  System.out.println(a1[i++]);
			  j++;
		  }
		  
	  }
		
	}

	public static void main(String[] args) {
		 int[] arr1 = {1, 3, 4, 5, 7};	
		 int[] arr2 =  {2, 3, 5, 6};
		 
		 InterSection obj = new InterSection();
		 obj.getUnion(arr1, arr2, arr1.length, arr2.length);
		 

	}

}	

