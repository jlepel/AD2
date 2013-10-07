package aufgabe2_1;

import java.util.Arrays;

public class MatrixArray implements MatrixInterface {

	float[][] matrix;

	public MatrixArray(int elem) {
		matrix = new float[elem][elem];
	}

	@Override
	public MatrixInterface add(MatrixInterface elem) {
		for (int i = 0; i < this.size(); i++) {

			for (int j = 0; j < elem.size(); j++) {

				this.setElement(i, j,
						this.getElement(i, j) + elem.getElement(i, j));

			}
		}

		return this;
	}

	@Override
	public MatrixInterface mul(int elem) {
		for (int i = 0; i < this.size(); i++) {

			for (int j = 0; j < this.size(); j++) {

				this.setElement(i, j, this.getElement(i, j) * elem);

			}
		}
		return this;
	}

	@Override
	public MatrixInterface pow(int elem) {

		for (int i = 0; i < this.size(); i++) {

			for (int j = 0; j < this.size(); j++) {

				this.setElement(i, j, (float) Math.pow(this.getElement(i, j),elem));

			}
		}
		
		return this;
	}

	@Override
	public MatrixInterface pow(MatrixInterface elem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MatrixInterface pot() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		return matrix.length;
	}

	@Override
	public float getElement(int x, int y) {
		return matrix[x][y];
	}

	@Override
	public void setElement(int xpos, int ypos, float elem) {
		matrix[xpos][ypos] = elem;
	}

	public String toString() {

		String result = " ";

		for (int i = 0; i < this.size(); i++) {

			result = result + Arrays.toString(matrix[i]);

		}
		return result;
	}

}
