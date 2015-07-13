public class MergeSort{

public static void main(String args[]){
	
	int[] array = new int[10];
	array[0] = 5;
	array[1] = 7;
	array[2] = 10;
	array[3] = 4;
	array[4] = 8;
	array[5] = 2;
	array[6] = 9;
	array[7] = 6;
	array[8] = 12;
	array[9] = 17;
	
	sort(array);
}
public static void sort(int[] array){

int arraySize = array.length;
int middle = arraySize/2;

System.out.println("middle: " + middle);

int left[] = new int[middle+1];
int right[] = new int[middle+1];
int i,j;
for(i=0;i<middle;i++){
left[i] = array[i];

}
for(i=middle;i<arraySize-1;i++){
right[i] = array[i];

}

while(left.length>1){
	
		System.out.println("leftarray : ");
printArray(left);
	sort(left);

}
while(right.length>1){
	sort(right);
	printArray(right);
}
//merge(array,left,right);



}

public static void printArray(int[] subArray){
	int i;
	for(i = 0; i<subArray.length; i++)
		System.out.println(subArray[i] + "\n");
}

}