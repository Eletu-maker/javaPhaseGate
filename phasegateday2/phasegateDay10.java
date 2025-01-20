public class phasegateDayQuestion10{
	public static void main(String []args){
	int[] nums = {1,2,3,4,5};

	for(int count=0; count<nums.length;count++){
	if (nums[count] % 2 ==0){
	nums[count] = 0;
}	else {
	nums[count] = 1;
}
}
	for(int count=0; count<nums.length;count++){
	System.out.print(nums[count]);
}
}

}