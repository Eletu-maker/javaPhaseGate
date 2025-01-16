import java.util.ArrayList;
public class Phasegate{
	public static void main(String []args){
	ArrayList<ArrayList<String>> logic = new ArrayList<>();
	ArrayList<Integer> option =  new ArrayList<>();
	String name = "1210";
	int optionAnswer =0; 
	for(int array = 0;array < name.length();array++){
	logic.add(new ArrayList<>());
}

	

	String answer= ""; 

	for(int number = 0;number < name.length();number++ ){
	System.out.println(name.charAt(number));
	for(int count = 0; count < name.length();count++){
	if(name.charAt(count)== name.charAt(number)){
	answer = "yes";
	System.out.println("yes");
	logic.get(number).add(answer);
}
	else{
	System.out.println("no");
	answer = "no";
	logic.get(number).add(answer);
}
}
	
}
	
	
System.out.println(logic);


for(int arrayLoop = 0;arrayLoop <name.length();arrayLoop++){

for(int question = 0;question <name.length();question++){
	if(logic.get(arrayLoop).get(question).equals("yes")){
	optionAnswer++;
}



}
	option.add(optionAnswer);
	optionAnswer = 0;

}

	System.out.println(option);



for(int better=0; better < name.length();better++){
	System.out.println(name.charAt(better));
	
}
// this is where i got it wrong help my life
for(int better=0; better < name.length();better++){
	
	
	if (name.charAt(better) == option.get(better)){
		System.out.println("true");
} else{
	System.out.println("false");
}
}










	
	
}



}

