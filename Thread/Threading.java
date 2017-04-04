package lab9;

public class Threading extends Thread{
	
	
	
	Thread t;
	
	public Threading(Thread t){
		this.t = t;
	}
	
	
	
	public static void printer(){
		try{
			for(int i=0;i<10;i++){
				System.out.println(i+1);
				Thread.sleep(100);
			}
			
		}catch(Exception e){
			
		}
	}
	
	//The run method for synchronization and threading
	public void run(){
		
		//if commented synchronized(), then sync will stop
		synchronized(t){
			Threading.printer();
		}
		
	}
	
	
	
	

	public static void main(String[] args) {
		
		
		//this object is compulsory to obtain synchronization
		Thread t = new Thread();
		
		Threading t1 = new Threading(t);
		Threading t2 = new Threading(t);
		
		
		t1.start();
		t2.start();
	}

}
