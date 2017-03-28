package lab7;
interface Bank{
	float getRate();
}
class SBI implements Bank{
	public float getRate(){
		return 7.11F;
	}
}
class PNB implements Bank{
	public float getRate(){
		return 9.54F;
	}
}
public class Inter {

	public static void main(String[] args) {
		 Bank b;
		 
		b = new SBI();
		System.out.println("SBI interest rate : "+b.getRate()+"%");
		b=new PNB();
		System.out.println("PNB interest rate : "+b.getRate()+"%");

	}

}
