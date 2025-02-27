
public class checkString{

	public static void main(String []args){
	String input1 ="ABCDE";
	String input2 ="BD";
	boolean result ;

	for(int count = 0; count <input1.length(); count++){
	for(int count2 =0; count2 < input2.length(); count2++){
	if ( input1.charAt(count) == input2.charAt(count2)){
	for(int count3 =0; count3 < input2.length(); count3++){
	if ( input1.charAt(count) != input2.charAt(count3)){
	result = true;
	break;
	}
	else{
	result = false;
	
}
	
}
}
}
	
}
	System.out.println(result);
}

}


	



