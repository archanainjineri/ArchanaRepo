package serviceNow;


public class HashTable {

	public static void main(String[] args) {
		HashMap hashMap= new HashMap();		
		
		//Insert the value key value into hash table, [Random key from 1 to 1000]
		int random=(int)(Math.random()*1000);
		hashMap.put(random, 1255);
		hashMap.put((int)(Math.random()*1000) , 9898);
		hashMap.put((int)(Math.random()*1000) , 4782);
		hashMap.put((int)(Math.random()*1000) , 7980);
		hashMap.put(random , 2975);
		hashMap.put((int)(Math.random()*1000) , 4342);
		hashMap.put((int)(Math.random()*1000) , 8885);
		hashMap.put((int)(Math.random()*1000) , 5322);
		hashMap.put((int)(Math.random()*1000) , 1298);
		
		//Prints hash table
		hashMap.printHashTable();

	}

}
// Class for hash data structure
 class HashEntry {
    private int key;
    private int value;
    HashEntry(int key, int value) {
          this.key = key;
          this.value = value;
    }     

    public int getKey() {
          return key;
    }

    public int getValue() {
          return value;
    }

}


 //Hash Map Class for creating hash table includes put and get method
 class HashMap {
      private final static int TABLE_SIZE = 50;
      HashEntry[] table;
      HashMap() {
            table = new HashEntry[TABLE_SIZE];
            for (int i = 0; i < TABLE_SIZE; i++)
                  table[i] = null;
      }
      public int get(int key) {
            int hash = (key % TABLE_SIZE);
            while (table[hash] != null && table[hash].getKey() != key)
                  hash = (hash + 1) % TABLE_SIZE;
            if (table[hash] == null)
                  return -1;
            else
                  return table[hash].getValue();
      }

       public void put(int key, int value) {
     
    	   int hash=(key%TABLE_SIZE);
    	System.out.println("Key " +key + "  " + "Hash Code " +  hash);
         
    	   if(table[hash] == null){
    		   System.out.print("Probe Number :");
    		   System.out.println(hash+ "  "+ value);
    		   table[hash] = new HashEntry(key, value);
    	   }
    	   else{
    		   while (table[hash] != null ){
                   hash = hash+3;
    		   }
    		   System.out.print("Probe Number :");
    		   System.out.println(hash+ "  "+ value);
    		   table[hash] = new HashEntry(key, value);
    	   }		  
    	  
      }
       
       //Prints the hash table
       public void printHashTable(){
    	   System.out.println("\n Hash Table : ");
    	   for (int i = 0 ; i <TABLE_SIZE ; i++){
    		   if(table[i] != null){
    			   System.out.println(table[i].getKey() + "  " + table[i].getValue());
    		   }
    	   }
       }

}