package aufgabe2_1;

public class Main {

	public static void main(String[] args) {
	MatrixInterface newMatrix = new MatrixArray(2);
	System.out.println(newMatrix.size());
	newMatrix.setElement(0, 0, 1.2f);
	newMatrix.setElement(0, 1, 2f);
	newMatrix.setElement(1, 0, 22f);
	newMatrix.setElement(1, 1, 2.5f);
	System.out.println(newMatrix.toString());

	
	MatrixInterface newMatrix1 = new MatrixArray(2);
	System.out.println(newMatrix.size());
	newMatrix1.setElement(0, 0, 2f);
	newMatrix1.setElement(0, 1, 4f);
	newMatrix1.setElement(1, 0, 6f);
	newMatrix1.setElement(1, 1, 2.5f);
	System.out.println(newMatrix1.toString());

	System.out.println("neue Matrix");
	//newMatrix.add(newMatrix1);
	newMatrix1.pow(3);
	System.out.println(newMatrix1.toString());
	}

}
