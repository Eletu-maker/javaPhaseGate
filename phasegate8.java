import java.util.ArrayList;
public class phasegate8{
	public static void main(String[]args){
	ArrayList<Integer> arraySort = new ArrayList<>();
	ArrayList<Integer> newArraySort = new ArrayList<>();
	int[] input1 = {3,1,5};
	int[] input2 = {8,6,4};

	
	
	for(int count1 = 0; count1 < input1.length; count1++){
	System.out.println(input1[count1]);
	arraySort.add(input1[count1]);
}
	
	
	for(int count = 0; count < input2.length; count++){
	arraySort.add(input2[count]);
}
	

	System.out.println(arraySort);
	System.out.println(arraySort.size());
	for(int count = 0; count < arraySort.size();count++){
	int lowest = 100000; 
	for(int index =0; index <arraySort.size();index++){
	if (arraySort.get(index) < lowest){
	lowest =arraySort.get(index);
}


}
	
	System.out.println(arraySort);
	for(int sorting = 0; sorting<arraySort.size();sorting++){
	if(lowest == arraySort.get(sorting)){
	newArraySort.add(arraySort.get(sorting));
	arraySort.remove(arraySort.get(sorting));
}
	
}

	System.out.println(newArraySort);


}
	System.out.println(arraySort);
	System.out.println(newArraySort);


}




}