package lab8;

class Student {
	
	String name;
	String rollNo;
	int score[] = new int[3];
	
	void setDetails(String name,String rollNo,int x,int y,int z){
		this.name = name;
		this.rollNo= rollNo;
		this.score[0] = x;
		this.score[1] = y;
		this.score[2] = z;
	}
	
	public void start1(Student s){
		
		Marks m = new Marks(s);
		m.start();
		Details d = new Details(s);
		d.start();
	}
	
}



//////////////////////////////////////////////////////////
class Details extends Thread{
	
	Student ss;
	
	public Details(Student s){
		
		this.ss = s;
	}
	
	public void run(){
		
		try{
			
			//Thread.sleep(500);
			System.out.println("Name : "+ss.name);
			Thread.sleep(500);
			System.out.println("Roll number : "+ss.rollNo);
		}catch(Exception e){
			
		}
		
	}

	
}


//////////////////////////////////////////////////////////
class Marks extends Thread{

	Student s;
	public void run(){
		
		//Student s = Marks.get();
		
		try{
			Thread.sleep(100);
		System.out.println("Marks 1 : "+s.score[0]);
		Thread.sleep(700);
		System.out.println("Marks 2 : "+s.score[1]);
		Thread.sleep(500);
		System.out.println("Marks 3 : "+s.score[2]);
		Thread.sleep(500);
		System.out.println("Sum : "+(s.score[0]+s.score[1]+s.score[2]));
		}catch(Exception e){
			
		}
		
	}
	
	public Student get(Student s){
		return s;
	}
	
	
	public  Marks(Student ss){
		this.s = ss;
	}
	
}

//////////////////////////////////////////////////////////
public class ThreadFun {
	
	public static void main(String args[]){
		Student ss = new Student();
		ss.setDetails("Saransh", "RA1511003010320", 99, 92, 95);
		ss.start1(ss);
	}
	

}
