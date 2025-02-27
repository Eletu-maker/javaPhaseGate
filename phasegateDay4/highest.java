public class highest{
	public static void main(String []args){
	int[][] input ={{1,2,3},{4,5,6}};
	high(input);
	
}

	public static void high(int[][] input){
	 int largestest=-10000000;

	for(int count1 =0; count1 <2;count1++){
	for(int count2 =0; count2 <3;count2++){
	if (input[count1][count2] > largestest){
	largestest = input[count1][count2];
}
	

}
}
	System.out.println(largestest); 
	for(int count1 =0; count1 <2;count1++){
	for(int count2 =0; count2 <3;count2++){
	if(largestest == input[count1][count2]){
	System.out.println("output :["+count1+"]["+count2+"]");
}
	
}
}
} 
}