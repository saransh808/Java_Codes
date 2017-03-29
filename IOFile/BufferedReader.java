import java.io.*;
import java.util.Scanner;
import static java.lang.System.out;
public class Practice {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]){
		
		String ss;
		
		out.println("File Program");
		
		
		
		
		 
		
		try{
			BufferedWriter inn  = new BufferedWriter(new FileWriter("output.txt"));
			
			while (true) {
				ss=sc.next();
				inn.newLine();
				inn.write(ss);
				if(ss.equals("Exit")||ss.equals("exit"))
					break;
					
			}
			inn.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
			
		
		
		try{
			BufferedReader bb = new BufferedReader(new FileReader("output.txt"));
			
			while(((ss=bb.readLine())!=null)){
				if(ss.equals("Exit")||ss.equals("exit"))
					continue;
				System.out.println(ss);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
