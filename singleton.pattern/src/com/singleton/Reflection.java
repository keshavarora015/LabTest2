package com.singleton;

import java.lang.reflect.Constructor;

public class Reflection {
	public static void main(String[] args)  {

		Serialization objOne = Serialization.globalAccessPoint();
		Serialization objTwo = null;
        try {
            Constructor<Serialization> constructor = Serialization.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            objTwo = (Serialization) constructor.newInstance();
        } catch (Exception ex) {
            System.out.println(ex);
        }

        System.out.println("Hashcode of Object 1 - "+objOne.hashCode());
        System.out.println("Hashcode of Object 2 - "+objTwo.hashCode());
        //hashCode of both the instance is not same that destroys the singleton pattern
    }
}
