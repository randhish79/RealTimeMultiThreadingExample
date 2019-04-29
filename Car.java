

public class Car {
	private boolean washed = false;
	boolean washAndDryCompleted = false;
	private String carName ;
	
	  
	    public Car(String name) {
		super();
		this.carName = name;
	}

		public synchronized void wash() {
	       if(washAndDryCompleted == false) {
	            try { 
	                
	                Thread.sleep(1000);
	                
	            } catch (InterruptedException e)  {
	                Thread.currentThread().interrupt(); 
	               System.out.println("Thread interrupted"+ e); 
	            }
	            System.out.println(Thread.currentThread().getName()+"---Washing -- "+carName);
	            washed = true;

                notifyAll();
	        }
	       
	         
	        
	    }
	  
	    public synchronized void dry() {
	    	
	        while (washed == false) {
	            try {
	            	 System.out.println(Thread.currentThread().getName()+"---Waiting for wash -- "+carName);
	            	wait();
	            	
	            } catch (InterruptedException e)  {
	                Thread.currentThread().interrupt(); 
	                System.out.println("Thread interrupted"+ e); 
	            }
	        }
	        

	        System.out.println(Thread.currentThread().getName()+"---Drying -- "+carName);
            washAndDryCompleted =  true;
	        notifyAll();
	       
	    }
}
