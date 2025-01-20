import java.util.Scanner;
public class phasegateDay3{

	public static void main(String []args){
	String input ="hello world";
	int number = input.length();
	int newli = number-1;
	int answer= 0;
	char single = 'q';
	
	int count =0;
	while(count <input.length()){
	System.out.println(input.charAt(newli));
	if (input.charAt(newli) == ' '){
	break;
	} else{
	answer++;
}

	newli--;
	count++;
}
	
	System.out.println(answer);
	
}


}