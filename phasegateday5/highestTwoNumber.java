import java.util.Arrays;
public class highestTwoNumber{
	public static void main(String []args){
	int[] question = {2,4,5,6,17,10,100};
	System.out.print(getHighestTwoNumber(question));

}
	public static int[] getHighestTwoNumber(int[] question){
	
	int[] answer = new int[2];
	int largest = Integer.MIN_VALUE;
	int index = -1;
	for(int count =0; count< question.length; count++){
	if(question[count] > largest){
	largest = question[count];
	index = count;
}
	
}
	
	answer[1] = largest;
	question[index] = Integer.MIN_VALUE;;
	largest =  Integer.MIN_VALUE;
	
	for(int count =0; count< question.length; count++){
	if(question[count] > largest){
	largest = question[count];
	
}
}
	answer[0] = largest;

	return answer;
	
	

}
}