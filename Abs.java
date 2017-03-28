package lab7;

abstract class Bank1{
	public abstract float getRate();
}

class SBI1 extends Bank1{
	public float getRate(){
		return 7.19F;
	}
}
class PNB1 extends Bank1{
	public float getRate(){
		return 9.52F;
	}
}

public class Abs {
	
	public static void main(String[] args) {
		 Bank1 b;
		 
		b = new SBI1();
		System.out.println("SBI interest rate : "+b.getRate()+"%");
		b=new PNB1();
		System.out.println("PNB interest rate : "+b.getRate()+"%");

	}

}
