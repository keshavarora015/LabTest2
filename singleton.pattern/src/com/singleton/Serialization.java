package com.singleton;

import java.io.Serializable;

public class Serialization implements Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		private Serialization(){
			System.out.println("Const Called");
		}
	    
	    private static class SingletonHelper{
	        private static final Serialization onlyInstance = new Serialization();
	    }
	    
	    public static Serialization globalAccessPoint(){
	        return SingletonHelper.onlyInstance;
	    }
	    
	    public static void main(String[] args) {
		 {
			 Serialization.globalAccessPoint();
		 }
		//The problem with serialized  class is that whenever we deserialize it, 
		//it will create a new instance of the class which break the singelton pattern
	}

}
