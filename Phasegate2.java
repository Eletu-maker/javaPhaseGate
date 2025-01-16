public class Phasegate2{
	public static void main(String [] args){
	
	int[] example1 = {1,5,3,4,5,5};
	int[] example2 = {1,2,8,20,5};

	int largest = -200;
		
	for(int count=0; count<example1.length;count++){
	if (example1[count] >largest){
	largest = example1[count];
}
	
}
	System.out.println(largest);
	

	for(int index = 0; index <example1.length; index++){
	if (example1[index] == largest){
	System.out.println(index);
	break;
}

}





}



}