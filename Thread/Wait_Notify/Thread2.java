package lab10;

class Thread2 extends Thread{
	
	Chat obj;
	
	
	public void run(){
		for(int i=0;i<10;i++){
			obj.answer();
		}
	}
	
	
	public Thread2(Chat obj){
		this.obj = obj;
		this.start();
	}

}
