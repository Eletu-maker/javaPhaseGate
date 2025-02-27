public class PrimeInSetNumber {
    public static void main(String[] args) {
        int input = 79; 
	PISN(input);
}
	
public static void PISN(int input){
	int len =input-1;
        int[] data = new int[len];
        int[] Primedata = new int[len];

	if(input == 0 || input == 1){
	System.out.println(0);
}
	
	int index =0;
	for(int count=2; count<=input;count++){
	data[index] = count;
	
	
	index++;
}

	for(int count1 =0; count1<len;count1++){
	int details = data[count1]; 
	int prime =0;
	for(int count2 =2; count2<=details;count2++){
	if(details %count2 ==0){
	prime++;
}	
	Primedata[count1]=prime;
}
}

	

	for(int cou=0;cou <len;cou++){
	if(Primedata[cou]==1){
	System.out.println(cou +2);
}
}
    }
}
