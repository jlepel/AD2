package aufgabe1_2;

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
	}

}
