package lab10;

class Thread1 extends Thread{
	
	Chat obj;
	
	
	public void run(){
		for(int i=0;i<10;i++){
			obj.question();
		}
	}
	
	
	public Thread1(Chat obj){
		this.obj = obj;
		new Thread(this).start();
		//this.start();
	}

}
