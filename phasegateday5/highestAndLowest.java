import java.util.Arrays;
public class highestAndLowest{
	public static void main(String []args){
	int[] question = {1,4,6,2,5};
	System.out.print(HAndL(question));
 
}
	public static String HAndL(int[] question){
	int[] answer = new int[2];
	int lowest = 1000000000;
	int highest = -1000000000;
	for(int count =0; count< question.length; count++){
	if (question[count] < lowest){
	lowest = question[count];
	
}
}
	answer[0] = lowest;

	for(int count =0; count< question.length; count++){
	if (question[count] > highest){
	highest=question[count];
}
}

	answer[1] = highest;

	return Arrays.toString(answer);


}

	

	
}