package com.singleton;

public class EagerInitialization {
	//we use private constructor not more than one object can be created
	private EagerInitialization()
	{
		System.out.println("Const Called");
	}
	
	//only instance of class
	private static final EagerInitialization onlyInstance  = new EagerInitialization();
	
	//global access point
	public static EagerInitialization globalAccessPoint(){
        return onlyInstance;
    }
	public static void main(String[] args) {
		EagerInitialization.globalAccessPoint();
		
		//Drawback:-
		//instance is created even though we are not using it
	}
}
