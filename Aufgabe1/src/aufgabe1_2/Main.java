package aufgabe1_2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		VerketteteListe list = new VerketteteListe();
		
		System.out.println(list.isEmpty());
		list.cons("BLAAA!");
		System.out.println(list.isEmpty());
		list.cons("ddddddddddd!");
		
		System.out.println(list.length());
		list.head();
		System.out.println(list.length());
	
		list.head();
		System.out.println(list.length());
	
		List<String> testlist = new ArrayList<String>();
		

	
	System.out.println("BLAAAAA: " + testlist.size());
		
		
	}

}
