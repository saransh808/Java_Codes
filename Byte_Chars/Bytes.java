package lab1;

public class Bytes {
	//Program to generate random Strings
	public static void main(String arsg[]){
	//	byte b = 97;
	//	System.out.println((char)b);
	//	char ch = 'a';
	//	System.out.println((byte)ch);
		
		
		//using Math.random() method;
		for(int i=0;i<10;i++){
			byte e=0; 
			do{
				e=(byte)(Math.random()*100);
			}while((e<65 || e>90) /*||
					((char)e !='S') &&
					((char)e !='A') &&
					((char)e !='R') &&
					((char)e !='A') &&
					((char)e !='N') &&
					((char)e !='S') &&
					((char)e !='H') 
					);try this also*/
				
				System.out.print((char)e);	
		}
	}

}
