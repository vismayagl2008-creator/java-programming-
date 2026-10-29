package vismaya;

import java.util.ArrayList;


public class Demo {
	public static void main(String[]args) {
		ArrayList<String> aa = new ArrayList<> ();
		aa.add("Asha");
		aa.add("Meera");
		aa.add("Rahul");
		
		aa.remove(1);
		aa.remove("Rahul");
		
		System.out.println(aa);
	}
	
	}


