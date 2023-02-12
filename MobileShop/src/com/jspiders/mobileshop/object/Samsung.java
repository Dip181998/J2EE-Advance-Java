package com.jspiders.mobileshop.object;

import com.jspiders.mobileshop.Mobile;

public class Samsung implements Mobile {

	@Override
	public void order() {
		System.out.println("ordered samsung");
	}

}
