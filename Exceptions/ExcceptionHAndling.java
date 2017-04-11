package lab11;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExcceptionHAndling {
	
	
	public static void methodFun(int z,int y) throws ArithmeticException,ArrayIndexOutOfBoundsException{
		
		System.out.println(z/y);
		int x[] = new int[1];
		System.out.println(x[3]);
	}
	
	
	public static void main(String args[])throws Exception{
		
		int a;
		a=10;
		File f = new File("a.txt");
		
		try(FileReader ff = new FileReader(f)){
			methodFun(a,0);
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
			System.out.println("This is Exception");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
			System.out.println("This is an array exception");
		}catch(IOException e){
			System.out.println(e.getMessage());
		}catch(Exception e){
			System.out.println("Exception");
		}finally{
			System.out.println("I am always executed, 'Finally'");
		}
	}

}
