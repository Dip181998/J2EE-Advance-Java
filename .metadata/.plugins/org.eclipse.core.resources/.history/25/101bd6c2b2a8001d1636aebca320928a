package com.jspiders.mobileshop.main;


import java.util.Scanner;

import com.jspiders.mobileshop.Mobile;
import com.jspiders.mobileshop.object.Iphone;
import com.jspiders.mobileshop.object.OnePlus;
import com.jspiders.mobileshop.object.Realme;
import com.jspiders.mobileshop.object.Samsung;

public class MobileMain {
	static Mobile mobile;
	public static void main(String[] args) {
		try {
			factory().order();
		} catch (NullPointerException e) {
			System.out.println("no mobile selected");
		}
	}
	private static Mobile factory() {
		System.out.println("=====Choose one mobile=====");
		System.out.println("1.OnePlus \n"+"2.samsung \n"+"3.Realme \n"+"4.Iphone");
		Scanner scanner=new Scanner(System.in);
		int choice=scanner.nextInt();
		scanner.close();
		switch (choice) {
		case 1:
			mobile=new OnePlus();
			return mobile;
		case 2:
			mobile=new Samsung();
			return mobile;
		case 3:
			mobile=new Realme();
			return mobile;
		case 4:
			mobile=new Iphone();
			return mobile;

		default:
			System.out.println("Invalid choice");
			return mobile;
		}
		
		
	}
}
