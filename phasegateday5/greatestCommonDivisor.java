public class greatestCommonDivisor{
	public static void main(String []args){
	int num1 = 16;
	int num2 = 24;
	System.out.print(get_greatestCommonDivisor(num1, num2));



}

	public static int get_greatestCommonDivisor(int num1,int num2){
	int checking = 0;
	int output=0;
	if (num1 >num2){
	checking = num2;
}	else{
	checking = num1;
	}
	System.out.println(checking)
	for(int count =1; count <=checking;count++){
	if(num1 % count ==0 && num2 % count ==0 )
	output = count;
}
	return 	output;


}

}