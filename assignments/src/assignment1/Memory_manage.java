package assignment1;

public class Memory_manage {
	 private String name;
	    public Memory_manage(String name) {
	        this.name = name;
	        System.out.println("Object Created is: " + name);
	    }
	    @Override
	    protected void finalize() throws Throwable {
	        System.out.println("Total Garbage collected: " + name);
	    }
	    public void display() {
	        int localCounter = 100;
	        System.out.println(name + " is using localCounter = " + localCounter);
	    }
	    public static void main(String[] args) {
	        Memory_manage obj1 = new Memory_manage("Object1");
	        Memory_manage obj2 = new Memory_manage("Object2");
	        obj1.display();
	        obj2.display();

	        obj1 = null;
	        obj2 = null;
	        System.gc();
	        try {
	            Thread.sleep(1000); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        System.out.println("End of main method");
	    }
}
