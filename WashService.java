

public class WashService implements Runnable {
	private Car car;
	public WashService(Car car){
		this.car = car;
	}
	public void run(){
		car.wash();
			
	}
	

}
