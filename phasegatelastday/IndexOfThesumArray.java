public class IndexOfThesumArray{
	public static void main(String [] args){
	int[][] input ={
	{89,7,7,3},
	{4,5,6},
	{7,8,9}
};


System.out.print(IOTSA(input));

}


	public static int IOTSA(int[][] input){
		int arrayLen = input.length;
	int[] step2 = new int[arrayLen] ;
	int sum;
	int index =0;
	for (int count=0; count< arrayLen; count++){
	sum =0;
	for (int count1 =0; count1<input[count].length; count1++){
	sum += input[count][count1];
}
	step2[count] = sum;
	
}

	int largest = Integer.MIN_VALUE;
	for(int count2 =0; count2 < arrayLen; count2++){
	if( step2[count2] > largest){
	largest = step2[count2];
	index = count2;
}
}
	
	return index;





}

}