package aufgabe2_1;

public class Main {

	public static void main(String[] args) {
	MatrixInterface newMatrix = new MatrixArray(3);
	System.out.println(newMatrix.size());
	newMatrix.setElement(0, 0, 1f);
	newMatrix.setElement(1, 0, 2f);
	newMatrix.setElement(2, 0, 3f);
	
	newMatrix.setElement(0, 1, 4f);
	newMatrix.setElement(1, 1, 5f);
	newMatrix.setElement(2, 1, 6f);
	
	newMatrix.setElement(0, 2, 7f);
	newMatrix.setElement(1, 2, 8f);
	newMatrix.setElement(2, 2, 9f);
	System.out.println(newMatrix.toString());
/***********************/
	
	MatrixInterface newMatrix1 = new MatrixArray(3);
	System.out.println(newMatrix.size());
	newMatrix1.setElement(0, 0, 1f);
	newMatrix1.setElement(1, 0, 2f);
	newMatrix1.setElement(0, 1, 3f);
	newMatrix1.setElement(1, 1, 4f);
	newMatrix1.setElement(0, 2, 5f);
	newMatrix1.setElement(1, 2, 6f);
	
	System.out.println(newMatrix1.toString());

	System.out.println(newMatrix.mul(newMatrix1).toString());
	
	}

}
