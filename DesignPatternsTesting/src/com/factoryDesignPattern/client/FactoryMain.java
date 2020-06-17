package com.factoryDesignPattern.client;

import com.factoryDesignPattern.phones.OS;
import com.factoryDesignPattern.phones.OperatingSystemFactory;

/**
 * @author Akhil
 *
 */
public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperatingSystemFactory osf = new OperatingSystemFactory();
		//We can give Android or iOS or anything else to get the 
		//object from the Operating System Factory class.
		OS obj = osf.getInstance("Windows");
		obj.spec();
	}

}
