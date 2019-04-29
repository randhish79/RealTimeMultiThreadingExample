

public class DryService implements Runnable {
	private Car car;
	public DryService(Car car){
		this.car = car;
	}
	public void run(){
		car.dry();
			
	}
	

}
