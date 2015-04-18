import java.util.Scanner;



public class TestMyStack {
	public static void main(String[] args){
		
		//create an object
		MyStack stack = new MyStack();
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter 5 strings
		System.out.println("Please enter 5 Strings.");
		
		//put the strings in array in order
		for(int i = 1;i<=5;i++){
			stack.push(input.next());
		}
		
		System.out.println("Inverse result:");
		
		//print the inverse order 
		while(!stack.isEmpty()){
			System.out.print(stack.pop()+" ");
		} 
		
		input.close();
		
}//end main method
}