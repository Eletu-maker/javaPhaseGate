import java.util.Arrays;
public class highestAndlowestStudent{
	public static void main(String []args){
	int[][] question = {
	{30,40,50},
	{10,20,50}
};
	
	System.out.print(HALS(question));

}

	public static String HALS(int[][] question){
	
		int arr1 = question.length;
	int arr2 = question[0].length;
	int[][] answer = new int[arr2][arr1];
	
	for(int count1 =0; count1<question.length;count1++){
	for(int count2 =0; count2<question[count1].length;count2++){
	answer[count2][count1] = question[count1][count2] ;

}
}
	
	
	int arr3 = answer.length;
	int arr4 = answer[0 ].length;
	
	int[] step2 = new int[arr3];

	

	int sum;
	
	for(int count3= 0; count3 < arr3;count3++){
	sum =0;
	for (int count4 =0; count4< arr4; count4++){
	sum +=answer[count3][count4];
}
	step2[count3]=sum;
}
	int[] finalAnswer = new int[2];
	int largest = Integer.MIN_VALUE;
	int lowest = Integer.MAX_VALUE;
	int indexFprHighest = -1;
	int indexFprLowest = -1;
	for(int count5 =0; count5 < step2.length; count5++){
	if (step2[count5] > largest){
	largest = step2[count5];
	indexFprHighest++;
}
	finalAnswer[0] = indexFprHighest;
	
	if (step2[count5] < lowest){
	lowest = step2[count5];
	indexFprLowest++;
}
	finalAnswer[1] = indexFprLowest;

}
	
	return Arrays.toString(finalAnswer);
	

}
}