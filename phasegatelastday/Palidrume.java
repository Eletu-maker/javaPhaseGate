public class Palidrume{
	public static void main(String [] args){
	int input = 00000921;
	String change = String.valueOf(input);
	System.out.print(change);
	System.out.print(Pali(input));

}
	public static boolean Pali(int input){
	String change = String.valueOf(input);
	boolean result = true;
	int lenght = String.valueOf(input).length();
	int loop = lenght/2;

	
	if(lenght %2 == 0){
	result = false;
} 
	else{
	for( int count =0; count < loop; count++){
	if( change.charAt(count) != change.charAt(lenght-1)){
	result = false;
}	
	lenght--;

}
}

	return result;
	
}

}