package lab5;

import java.util.Scanner;

public class OuterClass {
	
	
	public static Scanner sc = new Scanner(System.in);

	private String name;
	
	InnerClass in = new InnerClass();
	
	public void getName() {
		System.out.println("Name : "+name);
	}

	public void setName(){
		String name;
		name = sc.next();
		this.name = name;
		
	}


	public void setDetails(){
		
		in.setBranch();
		in.setRollNo();
	}
	
	public void getDetails(){
		this.getName();
		System.out.println("Branch = "+in.Branch);
		System.out.println("RollNo = "+in.rollNo);
	}
	
	//Inner CLASS DECLARATION
	public class InnerClass{
		
		private int rollNo;
		private String Branch;

		public void setRollNo() {
			int rollNo;
			System.out.println("Enter RollNo : ");
			rollNo = sc.nextInt();
			this.rollNo = rollNo;
		}


		public void setBranch() {
			System.out.println("Enter Branch");
			String branch;
			branch = sc.next();
			this.Branch = branch;
		}
		
		
	}

	
	
	
}
