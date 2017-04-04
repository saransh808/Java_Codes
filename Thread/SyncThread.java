package lab9;


public class SyncThread extends Thread {
	
	String rollNo;
	String name;
	int count;
	Thread t ;
	SyncThread st;
	
	public SyncThread(String name, String rollNo, Thread t){
		System.out.println("Name : "+ name);
		this.t = t;
		System.out.println("RollNo : "+ rollNo);
		st = this;
		this.name = name;
		this.rollNo = rollNo;
		count =1;
		
	}
	
	
	public void list(){
		try{
			for(int i=0;i<10;i++){
				System.out.println(this.count);
				this.count++;
				Thread.sleep(00);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	public void run(){
		
		//if commented synchronized() then sync will stop
		synchronized(t){
			this.list();
			
		}
	}
	
	
	
	
	
	public static void main(String arsg[]){
		
		
		Thread t = new Thread();
		
		
		SyncThread t1 = new SyncThread("Saransh", "Ra1511003010320",t);
		SyncThread t2 = new SyncThread("Mayuri", "Ra1511003010298",t);
		
		
		t1.start();
		t2.start();
		
		
	}

}
