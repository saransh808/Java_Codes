package lab10;

class Chat {
	
	
	boolean control = false;
	
	public synchronized void question(){
		if(control){
			try{
				wait();
			}catch(Exception e){
				
			}
		}
		System.out.println("This is Question");
		control=true;
		notify();
	}
	
	
	public synchronized void answer(){
		if(!control){
			try{
				wait();
			}catch(Exception e){
				
			}
		}
		System.out.println("This is Answer");
		control=false;
		notify();
	}

}
