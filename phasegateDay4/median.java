import java.util.ArrayList;
public class median{
	public static void main(String []args){
	ArrayList<Integer> result = new ArrayList<>();
	ArrayList<Integer> median = new ArrayList<>();
	int[] input1 = {1,2,3};
	int[] input2 = {2,3,4};
	int[] inputnew = {0,0,0,0,0,0};
	int large = -900;
	

	for(int count = 0; count <input1.length;count++){
	inputnew[count]= input1[count];
}
	

	int nextArray = 3;
	



	for(int count = 0; count <input2.length;count++){
	inputnew[count+nextArray]= input2[count];;

}






	
	for(int count=0; count < inputnew.length; count++){
	 for(int count1=0; count1 < inputnew.length; count1++){
	if ( inputnew[count1]>large ){
	large = inputnew[count1];
}
}
	result.add(large);
	for (int j = 0; j <inputnew.length;j++){
	if (large == inputnew[j]){
	inputnew[j] = 0;
	break;
}
}
	large = -900;
}
	System.out.println(result);

	int sum =0;
	for (int j = 0; j <result.size();j++){
	sum += result.get(j) ;
}
	System.out.println(sum);

	int middle = result.size()/2;
	
	
	if (result.size()%2==0 ){
	median.add(result.get(middle));
	median.add(result.get(middle -1));
	

}
	else{
	 median.add(result.get(middle));
	
}
	System.out.println(median);

}





	





}
