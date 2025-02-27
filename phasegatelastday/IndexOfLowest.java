import java.util.Arrays;
public class IndexOfLowest{
	public static void main(String [] args){
	int[] input ={-1,0,0,-2,-9};
	
	System.out.print(IOL(input));
}

	public static String IOL(int[] input){
	int lowest = Integer.MAX_VALUE;
	int index =0;
	int[] arrayIndex = {0};
	for(int count=0; count <input.length;count++){
	if ( input[count] < lowest ){
	lowest = input[count];
}
}

	for(int count1 =0; count1 < input.length;count1++){
	if(input[count1] == lowest){
	index = count1;
	break;
}
}
	arrayIndex[0] = index;

	return Arrays.toString(arrayIndex);
}

}