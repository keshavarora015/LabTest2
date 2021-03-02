package com.singleton;

public class StaticBlock {
	 private static StaticBlock onlyInstance;
	    
	    private StaticBlock(){
	    	System.out.println("Const Called");
	    }
	    
	    static{
	        try{
	            onlyInstance = new StaticBlock();
	        }catch(Exception e){
	            throw new RuntimeException("Exception occured");
	        }
	    }
	    
	  //global access point
	    public static StaticBlock globalAccessPoint(){
	        return onlyInstance;
	    }
	    public static void main(String[] args) {
			StaticBlock.globalAccessPoint();
		}
}
