package com.singleton;

public class LazyInitialization {

	 	private LazyInitialization(){
	 		System.out.println("Const Called");
	 	}
	 
	    private static LazyInitialization onlyInstance;
	    
	  //global access point
	    public static LazyInitialization globalAccessPoint(){
	        if(onlyInstance == null){
	        	onlyInstance = new LazyInitialization();
	        }
	        return onlyInstance;
	    }
	    public static void main(String[] args) {
	    	LazyInitialization.globalAccessPoint();
		}
}
