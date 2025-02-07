package stringtopic.immutableway;

import java.util.Iterator;

public class TestApp4 {
	public static void main(String[] args) {
		String name = "Royal";
		System.out.println("name.length()---"+name.length());
		
		for(int i=0;i<=name.length();i++) {
			System.out.println("name.charAt("+i+")"+name.charAt(i));
		}
	}
}
