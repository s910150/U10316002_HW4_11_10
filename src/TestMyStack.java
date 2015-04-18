import java.util.Scanner;



public class TestMyStack {
	public static void main(String[] args){
		
		MyStack stack = new MyStack();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter 5 Strings.");
		for(int i = 1;i<=5;i++){
			stack.push(input.next());
		}
		
		System.out.println("Inverse result:");
		while(!stack.isEmpty()){
			System.out.print(stack.pop()+" ");
		} 
		
}//end main method
}