public class uniqueElement{
	public static void main(String [] args){
	int[] input = {1,2,6,3,5,4,2};
	int len = input.length;
	int[] data = new int[len];
	int value;
	for (int count=0; count < input.length;count++){
	value =0;
	for (int count1=0; count1 < input.length;count1++){
	if( input[count] == input[count1]){
	value++;

}
}


data[count] = value;



}

int length =0;
for(int count2=0; count2 < data.length; count2++){
if(data[count2] ==1){
length++;
}
}



int[] output = new int[length];
int index =0;
for(int count3 =0; count3< len;count3++){
if(data[count3] ==1){

	output[index] = input[count3];
	index++;
}

}




for(int i=0; i <length; i++){
	System.out.println(output[i]);
}


}

}