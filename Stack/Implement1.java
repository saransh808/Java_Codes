package lab3;

import java.util.Scanner;

import static java.lang.System.out;
import java.io.PrintStream;


public class Implement1 {
	
	public static PrintStream p = System.out;
	
	public static void p(String s){
		System.out.println(s);
	}
	
	public static void p(){
		System.out.println();
	}
	
	public static void pLine(){
		System.out.println("========================");
	}
	
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Stack stack = new Stack();
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.println("3.Display");
		int ch;
		int num;
		while(true){
			pLine();
			
			ch = sc.nextInt();
			switch(ch){
			case 1 : p("Enter a number");
			num = sc.nextInt();
			stack.push(num);
			break;
			
			case 2: p("Popped out "+stack.pop());
			break;
			
			case 3:stack.display();
			break;
			
			default : p("Wrong choice");
			break;
			}
			
		}
		

	}

}
