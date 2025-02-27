import java.util.Arrays;
public class JoinAndSort{
	public static void main(String [] args){
	int [] input1 = {0,-1,56};
	int [] input2 = {90,8,6};


System.out.print(JAS(input1, input2));

}


public static String JAS(int[] input1, int[] input2){
		int joinLength = input1.length + input2.length;
	int inputLength =  input1.length;
	
	int[] output = new int[joinLength];
	int[] output1 = new int[joinLength];

	for(int count =0;count< input1.length; count++){
	output[count] = input1[count];
}
	
for(int count1 =0;count1< input2.length; count1++){
	output[count1 + inputLength] = input2[count1];
}

	int index;
	int largest ;
	for(int count2 =0; count2< output.length; count2++){
	largest = Integer.MIN_VALUE;
	index =0;
	for (int count3 =0; count3 <  output.length; count3++){
	if (output[count3] > largest){
	largest = output[count3];
	index = count3;
}		
}

	output[index] = Integer.MIN_VALUE;
	
	output1[count2] = largest;

}

	return Arrays.toString(output1);



}

}