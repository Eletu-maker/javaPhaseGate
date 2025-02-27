public class reverseSentence{
	public static void main(String [] args){
	String input = "how are you";
	System.out.println(RS(input));
}

	public static String RS(String input){
	String output ="";
	int StringLen =  input.length();
	int numbSpace =0;
	int[] array = new int[3];
	for(int count=0;count<StringLen;count++){
	if(input.charAt(count) ==' '){
	
	array[numbSpace]= count;
	numbSpace++;
}
}
	array[2]= StringLen-1;

	
	int data1=array[0];
	for(int cou=0; cou <=array[0];cou++ ){
	output += input.charAt(data1);
	data1--;
}

	int data2=array[1];
	for(int cou=array[0]; cou <=array[1];cou++ ){
	output += input.charAt(data2);
	data2--;
}

	int data3 = array[2];
	for(int cou=array[1]; cou <array[2];cou++ ){
	output += input.charAt(data3);
	data3--;
}
	return output;




}

}