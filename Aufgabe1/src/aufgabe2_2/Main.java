package aufgabe2_2;

import aufgabe2_1.MatrixInterface;

public class Main {

	public static void main(String[] args) {
		MatrixInterface test = new MatrixArrayList(2);
		test.setElement(1, 1, 1f);
		test.setElement(0, 1, 6f);
		
		MatrixInterface test1 = new MatrixArrayList(2);
		test1.setElement(1, 1, 1f);
		test1.setElement(0, 1, 6f);
		test.pow(2);
		
		System.out.println(test.toString());
		//System.out.println(test.size());
		//System.out.println(test.toString());
		//System.out.println(test.getElement(0, 1));
	}

}
