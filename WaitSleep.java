package java_project;

public class WaitSleep {
	private static Object LOCK = new Object();
	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(200);
        System.out.println("Thread '" + Thread.currentThread().getName() + "' will work after sleeping for 1 second");
        synchronized (LOCK) 
        {
            LOCK.wait(200);
            System.out.println("Object '" + LOCK + "' will work after" + " waiting for 1 second");
        }
		
	}

	}


