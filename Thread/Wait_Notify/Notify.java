package lab10;

public class Notify{
	
	
	
	public static void main(String args[]){
		Chat obj = new Chat();
		 
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
	}

}
