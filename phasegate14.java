import java.util.ArrayList;
public class phasegate14{
	public static void main(String []args){
	ArrayList<Integer> array = new ArrayList<>();
	int[] nums = {2,7,11,15};
	int target = 9;
	int first =0;
	int second =0;
	for(int A=0; A < nums.length;A++){
	first = nums[A];
	for(int B = 0; B< nums.length;B++){
	second = nums[B];
	if(first + second == target){
	array.add(first);
	array.add(second);
	break;
}

}

	
}
	array.remove(0);
	array.remove(1);
	System.out.print(array);










}


}