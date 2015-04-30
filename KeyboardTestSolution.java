public class KeyboardTestSolution {

	public static void main(String args[]) {
		String[][] keys = {
				{ "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" },
				{ "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P" },
				{ "A", "S", "D", "F", "G", "H", "J", "K", "L", ";" },
				{ "Z", "X", "C", "V", "B", "N", "M", ",", ".", "/" }

		};
		 printMatrix(keys);

			horizontalFlip(keys);
		printMatrix(keys);
		
			verticalFlip(keys);
		printMatrix(keys);
		
		//Used extra memory -> copied keys to another keys array in order to shift
		keys = shift(-2,keys);
		printMatrix(keys);
	}

	
	private static String[][]  shift(int n, String[][] keys){
		
		if(n>=0)
		return shiftRight(keys, n);
		
		else
			return shiftLeft(keys,n);
	
		
	}
	
	
	private static String[][]  shiftRight(String keys[][], int n)
	{
	  int z;
	  for (z = 0; z < n; z++)
		  //singleShiftRight(keys);{
	  {
		  int i,j;
		  String temp = keys[keys.length-1][keys[0].length-1];
		 String[][] keys2 = new String[keys.length][keys[0].length];
		 for(i=0;i<=keys.length-1;i++){
			 keys2[i][0] = temp;
			 for(j=0;j<keys[i].length-1;j++){
				
				 /*int kpos = ((keys[0].length)*i)+j+1;
				int length = keys.length*keys[0].length;
				System.arraycopy(keys, kpos, keys2, kpos-1, length);*/
				 
				 keys2[i][j+1] = keys[i][j];
				 
			 }
			 temp = keys[i][keys[i].length-1];
		 }
		 keys = keys2;
	  }
	  return keys;
	}
	 

	private static String[][]  shiftLeft(String keys[][], int n)
	{
		n = Math.abs(n);
	  int z;
	  for (z = 0; z < n; z++)
		  
	  {
		  int i,j;
		  String temp = keys[keys.length-1][0];
		 String[][] keys2 = new String[keys.length][keys[0].length];
		 for(i=0;i<=keys.length-1;i++){
			 keys2[i][keys[i].length-1] = temp;
			 for(j=keys[i].length-1;j>0;j--){
				
				 keys2[i][j-1] = keys[i][j];
				 
			 }
			 temp = keys[i][0];
		 }
		 keys = keys2;
	  }
	  return keys;
	}
	
	private static String[][] horizontalFlip(String[][] keys) {

		int i;
		// Flip/Swap the elements in each row
		for (i = 0; i < keys.length; i++) {
			int first = 0;
			int last = keys[i].length - 1;

			while (first < last) {

				String temp = keys[i][first];
				keys[i][first++] = keys[i][last];
				keys[i][last--] = temp;

			}

		}
		return keys;
	}
	
	private static String[][] verticalFlip(String[][] keys){
		int cols = keys[0].length;
		int j;
		for( j=0;j<cols;j++){
			
			//Flip columns
			int first = 0;
			int last = keys.length-1;
			while(first<last){
				String temp = keys[first][j];
				keys[first][j] = keys[last][j];
				keys[last][j] = temp;
				
				first++;
				last--;
			}
		}
		return keys;
		
	}

	private static void printMatrix(String[][] keys) {

		int i,j;
		for ( i = 0; i < keys.length; i++) {
			for ( j = 0; j < keys[i].length; j++) {
				System.out.println(keys[i][j] + " ");

			}
			System.out.println("\n");
		}
	}

}
