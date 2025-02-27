public class reverseString{
	public static void main(String []args){
	
	String input ="ABCD";
	reverse(input);
	
	
	
}

	public static void reverse(String input){
	int len = input.length();
	int stringlen = len -1;
	for(int count = 0; count<input.length(); count++){
	System.out.print(input.charAt(stringlen));
	stringlen--;

}
}
}