public class MultiDimentionalString{
    public static void main(String[] args){
    	String line = "1,4,3,2,3,7,5,6,9\n" + "8,6,3,7,3,7,5,6,9\n"; 
    	int n = 0;
    	
    	String[] rows = line.split("\n");
    	String[][] arr = new String[rows.length][];
    	
    	// splitting row to get columns of elements
    	for(String row : rows){
    		arr[n++] = row.split(",");
    	}
    	//converting string to int array
    	int[][] arrNumbers = new int[arr.length][arr[0].length];
    	for(int i = 0; i < arr.length; i++){
    		for(int j = 0; j < arr[i].length; j++){
    			arrNumbers[i][j] = Integer.parseInt(arr[i][j]);
    			
    			System.out.print(arrNumbers[i][j] + " ");
    		}
    		System.out.println("");
    	}	
    	System.out.println();
    	
    	System.out.println("Ascending order of 2 dimentional array:");
    	for(int i = 0; i < arrNumbers.length; i++){
    	  for(int j = 0; j < arrNumbers[i].length; j++){
    	    for(int k = 0; k < arrNumbers[i].length - j - 1; k++){
    				
    		if(arrNumbers[i][k] > arrNumbers[i][k+1]){
    		   int temp = 0;
    		   temp = arrNumbers[i][k];
    		   arrNumbers[i][k] = arrNumbers[i][k+1];
    		   arrNumbers[i][k+1] = temp;
    		 }
    		}
    	   }
    	}
    	for(int i = 0; i < arrNumbers.length; i++){
    	  for(int j = 0; j < arrNumbers[i].length; j++){
    	     System.out.print(arrNumbers[i][j] + " ");
    		}
    		System.out.println("");
    	}
    	System.out.println();
    	
    	System.out.println("Descending order of 2D array:");
    	for(int i = 0; i < arrNumbers.length; i++){
    	  for(int j = 0; j < arrNumbers[i].length; j++){
    	    for(int k = 0; k < arrNumbers[i].length - j - 1; k++){
    				
    	     if(arrNumbers[i][k] < arrNumbers[i][k+1]){
    		 int temp = 0;
    		 temp = arrNumbers[i][k];
    		 arrNumbers[i][k] = arrNumbers[i][k+1];
    		 arrNumbers[i][k+1] = temp;
    		}
    	    }	
    	  }
    		
    	}
    	for(int i = 0; i < arrNumbers.length; i++){
    	 for(int j = 0; j < arrNumbers[i].length; j++){
    	  System.out.print(arrNumbers[i][j] + " ");
    		}
    		System.out.println("");
    	}	

    }
}
