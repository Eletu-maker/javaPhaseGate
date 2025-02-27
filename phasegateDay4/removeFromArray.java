
public class removeFromArray{
	public static void main(String []args){
	
	int[] input= {10,7,2,5,6,7};
	int check = 7;
	removeInteger(input, check);
}

	public static void removeInteger(int[] input, int check){
	int space = input.length;
	int[] output = new int[space]; 
	for (int count= 0; count <input.length; count++){
	if (input[count] == check){
	space = input.length-1;
	continue;
}	else{
	output[count] = input[count];
}
}
	
	for (int count= 0; count <space; count++){
	System.out.println(output[count]);
}
}

}