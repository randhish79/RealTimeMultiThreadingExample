

public class ThreadSimultaneousWashDry {
public static void main(String[] args){
	Car c1 = new Car("C1");
	Car c2 = new Car("C2");
	Car c3 = new Car("C3");
	Car c4 = new Car("C4");
	WashService washService1 = new WashService(c1);
	WashService washService2 = new WashService(c2);
	WashService washService3 = new WashService(c3);
	WashService washService4 = new WashService(c4);
	DryService dryService1 = new DryService(c1);
	DryService dryService2 = new DryService(c2);
	DryService dryService3 = new DryService(c3);
	DryService dryService4 = new DryService(c4);
	Thread t1 = new Thread(dryService1, "dryService 1");
	Thread t2 = new Thread(dryService2, "dryService 2");
	Thread t3 = new Thread(dryService3, "dryService 3");
	Thread t4 = new Thread(dryService4, "dryService 4");
	
	Thread t5 = new Thread(washService1, "washService 1");
	Thread t6 = new Thread(washService2, "washService 2");
	Thread t7 = new Thread(washService3, "washService 3");
	Thread t8 = new Thread(washService4, "washService 4");
	
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();
	t6.start();
	t7.start();
	t8.start();
}
}
