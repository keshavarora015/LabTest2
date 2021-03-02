package com.enumsingelton;

public class EnumTester {
	public static void main(String[] args){
		Enum enum1 = Enum.INSTANCE;
		Enum enum2 = Enum.INSTANCE;
        
		
		//here the  hashcode will be same 
        System.out.println(enum1.hashCode());
        System.out.println(enum2.hashCode());
    }
}
