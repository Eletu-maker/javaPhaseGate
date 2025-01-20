import java.util.ArrayList;
public class phasegateDayQuestion4{
	
	public static void main(String []args){
	ArrayList<Integer> arraylist =  new ArrayList<>();
	int [] nums = {4,5,1,3,2};
	int largest =10000;
	
	for(int all=0; all <nums.length; all++){
	for(int count =0; count  <nums.length;count++){
	if (nums[count] < largest ){
	largest = nums[count];
	
}
	
}
	
	arraylist.add(largest);
	
	for(int count2 =0; count2 <nums.length; count2++ ){
	if (largest == nums[count2]){
	nums[count2] = 1000000;
	
}

}
	largest = 100000;
	
}
	
	System.out.print(arraylist);
}


}