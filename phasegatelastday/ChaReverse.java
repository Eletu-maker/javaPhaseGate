public class ChaReverse{
	public static void main(String[] arg){
	String input = "abcdef";
	char ch = 'd';
	System.out.println(CR(input,ch));

}

	public static String CR(String input,char ch){
	String output = "";


	int breac =0;
	for(int count=0; count<input.length();count++){
	if(input.charAt(count)==ch){
	breac = count; 
}
}
	
	

	for(int count1=breac; count1>=0; count1--){
	output += input.charAt(count1);
}

	for(int count2=breac+1; count2<input.length();count2++){
	output += input.charAt(count2);
}

	return output;










}
}