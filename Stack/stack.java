package lab3;

public class Stack {
	private int stack[] = new int[10];
	
	
	public static int i=0;
	
	
	public void push(int num){
		if(i==5){
			System.out.println("Stack already full");
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx");

		}else{
			Implement1.p("Pushed : |"+num+"|");
			this.stack[i++] = num;
		}
	}
	
	
	public int pop(){
		if(i==0){
			System.out.println("Stack already empty");
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			return 0;
		}else{
			return this.stack[--i];
		}
	}
	
	
	public void display(){
		while(i!=0){
			System.out.println("popped : |"+this.pop()+"|");
		}
	}
	
	
	
}
