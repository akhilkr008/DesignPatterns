package com.phones;

public class OperatingSystemFactory {
	public OS getInstance(String str) {
		if(str.equals("Android"))
			return new Android();
		else if(str.equals("iOS"))
			return new iOS();
		else 
			return new Windows();
	}
}
