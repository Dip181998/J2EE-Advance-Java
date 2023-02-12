package com.jspiders.mobileshop.object;

import com.jspiders.mobileshop.Mobile;

public class Iphone implements Mobile {

	@Override
	public void order() {
		System.out.println("ordered iphone");
	}

}
