import java.util.Arrays;
public class changingRowAndColumn{
	public static void main(String []args){
	int[][] question = {
	{12,34},
	{26,37},
	{65,49}
};

	System.out.print(CRAC(question));

}
	public static String CRAC(int[][] question){
	int arr1 = question.length;
	int arr2 = question[0].length;
	int[][] answer = new int[arr2][arr1]; 
	
for(int count1 =0; count1 < question.length; count1++){
for(int count2 =0; count2 < question[0].length; count2++){
	  answer[count2][count1] = question[count1][count2] ;
}
}

	return Arrays.deepToString(answer);
	
}

}