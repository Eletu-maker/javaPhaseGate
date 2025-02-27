public class StringApperance{
	public static void main(String [] args){
	String input ="hello";
	int[] array = new int[input.length()];
	for(int count =0; count <input.length();count++){
	int sum = 0;
	for(int count1 =0; count1 <input.length();count1++){
	if (input.charAt(count) == input.charAt(count1)){
	sum++;
}
}
	array[count]=sum;
}
	for(int cou=0;cou <input.length();cou++){
	System.out.println(array[cou]);
}





}

}