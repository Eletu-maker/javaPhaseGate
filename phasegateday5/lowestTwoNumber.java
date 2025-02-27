import java.util.Arrays;
public class lowestTwoNumber{
	public static void main(String []args){
	int[] question = {2,4,5,6,1,10,9};
	System.out.print(L2N(question));
}
	public static String L2N(int[] question){
	int[] answer = new int[2];
	int lowest = Integer.MAX_VALUE;
	int index = -1;
	for(int count =0; count< question.length; count++){
	if (question[count] < lowest){
	lowest = question[count];
	index= count;
}
}

	answer[1] = lowest;
	question[index] = Integer.MAX_VALUE;
	lowest =Integer.MAX_VALUE;

	
	for(int count =0; count< question.length; count++){
	if(question[count] < lowest){
	lowest = question[count];
	
}
}
	answer[0] = lowest;

	return Arrays.toString(answer);


}

}