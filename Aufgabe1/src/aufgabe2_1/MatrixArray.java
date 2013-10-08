package aufgabe2_1;

import java.util.Arrays;

public class MatrixArray implements MatrixInterface {

	float[][] matrix;

	public MatrixArray(int size) {
		matrix = new float[size][size];
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

				this.setElement(i, j,
						(float) Math.pow(this.getElement(i, j), elem));

			}
		}

		return this;
	}

	@Override
	public MatrixInterface mul(MatrixInterface matr) {
		MatrixInterface result = new MatrixArray(this.size());

		for (int i = 0; i < this.size(); i++) {

			for (int j = 0; j < matr.size(); j++) {

				float temp = 0;
				for (int k = 0; k < this.size(); k++) {
					temp = temp
							+ (this.getElement(i, k) * matr.getElement(k, j));

					result.setElement(i, j, temp);
				}

			}

		}
		return result;
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
