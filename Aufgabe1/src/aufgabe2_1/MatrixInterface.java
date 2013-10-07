package aufgabe2_1;

public interface MatrixInterface {


	
	MatrixInterface add(MatrixInterface elem);
	
	MatrixInterface mul(int elem);
	
	MatrixInterface pow(int elem);
	
	/**
	 @exception A Matrix
	 **/
	MatrixInterface pow(MatrixInterface elem);
	
	MatrixInterface pot();
	
	int size();
	
	float getElement(int x, int y);
	
	void setElement(int xpos, int ypos, float elem);
	
	
}
