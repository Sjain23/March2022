package collections_Concepts;

import java.util.ArrayList;
import java.util.Stack;

public class StackLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> programs = new Stack<String>();
		
		programs.push("Java");
		programs.push("Python");
		programs.push(".Net");
		programs.push("JavaScript");
		
		System.out.println(programs);
		
		System.out.println(programs.peek());
		
		programs.pop();
		
		System.out.println(programs);
		
		System.out.println(programs.peek());
		
		
	}

}
