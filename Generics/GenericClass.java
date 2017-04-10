package lab11;

public class GenericClass <Z>{
	
	private Z name;
	
	
	
	
	public GenericClass(){
		System.out.println("This is s 'General' generic");
	}
	
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	public GenericClass(String s){
		System.out.println("Created a 'String' type for generic");
	}
	
	
	public GenericClass(double s){
		System.out.println("Created a 'Double' type for generic");
	}
	
	
	public GenericClass(int s){
		System.out.println("Created a 'Integer' type for generic");
		
	}
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	
	
	public static void printAll(GenericClass ...obj ){
		System.out.println("\nObjects you created");
		for(GenericClass gen:obj){
			System.out.println(gen.getName1().getClass().getName());
		}
	}
	
	////////////////////////////
	public Z getName1() {
		return name;
	}

	public void setName(Z name) {
		this.name = name;
	}
	/////////////////////////////
	
	public static void main(String args[]){
		
		
		
		GenericClass gen = new GenericClass();
		gen.setName(89.89F);
		System.out.println(gen.getName1());
		System.out.println();
		
		
		GenericClass<Integer> genInteger = new GenericClass<Integer>(32);
		genInteger.setName(21);
		System.out.println("Value : "+genInteger.getName1());
		System.out.println("Class : "+genInteger.getClass().getName());
		System.out.println();
		
		
		GenericClass<String> genString = new GenericClass<String>("Saransh");
		genString.setName("Saransh");
		System.out.println("Value : "+genString.getName1());
		System.out.println("Class : "+genString.getClass().getName());
		
		
		
		
		printAll(genString,genInteger,gen);
		
	}
	

}
