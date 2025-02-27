public class NumberOfApperance{
	public static void main(String [] args){
	String input1 = "marchet";
	String input2 = "arce";
	boolean output = false;

	System.out.print(NOA(input1,input2));

}

	public static boolean NOA(String input1,String input2){
	boolean output = false;

	for(int count=0; count <input1.length(); count++){
	for(int count1=0; count1 <input2.length(); count1++){
	if(input1.charAt(count) == input2.charAt(count1)){
	for(int count2=0; count2 <input2.length(); count2++){
	if(input1.charAt(count) ==input2.charAt(count2)){
	output = true;
	count++;
}
	else{
	output = false;
	break;
}
}
	
}
	break;
}
}

	return output;
}

}