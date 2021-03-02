package com.singleton;

public class ThreadSafe {
	
	 	private ThreadSafe(){
	 		System.out.println("Const Called");
	 	}
	 	static Object lock;
	 	
	    private static ThreadSafe onlyInstance;
	    
	  //global access point
	    public static ThreadSafe globalAccessPoint(){
	        if(onlyInstance == null){
	            synchronized (lock) {
	                if(onlyInstance == null){
	                	onlyInstance = new ThreadSafe();
	                }
	            }
	        }
	        return onlyInstance;
	    }
	    public static void main(String[] args) {
	    	 ThreadSafe.globalAccessPoint();
		}

}
