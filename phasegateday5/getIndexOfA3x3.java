import java.util.Arrays;
public class getIndexOfA3x3{
	public static void main(String []args){
	int[][] question = {{1,2,3},{4,5,6},{7,8,9}};
	int check = 7;
	System.out.print(GIO3x3(question,check));

 
}

	public static String GIO3x3(int[][] question, int check ){
	int[] answer = {0,0};
	
	int ans = 0;
	int ans1 =0;
	for(int count =0; count <question.length; count++){
	for(int count1 =0; count1 <question[0].length; count1++){
	if(question[count][count1] == check){
	ans = count;
	ans1 = count1;
}
}
}

	
	answer[0]= ans;
	answer[1]= ans1;


	return Arrays.toString(answer);


}
}