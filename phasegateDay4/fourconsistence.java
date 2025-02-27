public class fourconsistence{
	public static void main(String []args){
	int[] input= {6,3,7,7,7,5,0,3};
	System.out.print(checkForFourConsecutiveDigit(input));
}
	public static boolean checkForFourConsecutiveDigit(int[] input){
	for(int count =0; count< input.length; count++ ){
	if(input[count]==input[count+1]){
	if(input[count]==input[count+1] && input[count]==input[count+2] && input[count]==input[count+3]){
	return true;
}
	return false;
}
	
}
return false;




}



}