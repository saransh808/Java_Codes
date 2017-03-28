package lab5;

public class Class_Demo {

	public static void main(String[] args) {
		
		
		OuterClass outer = new OuterClass();
		
		
		System.out.println("Enter name : ");
		outer.setName();
		outer.setDetails();
		System.out.println();
		outer.getDetails();
		
		

		//To access private member of Inner Class outside Outer Class
		/*Since Inner Class is in Outer Class, so it follows this 
		*	syntax to Instance InnercLass Object
		*/
		//OuterClass.InnerClass inner = outer.new InnerClass();
		
		
		System.out.println();
		
		
	}

}
