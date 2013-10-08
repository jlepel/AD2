package aufgabe2_2;

import java.util.ArrayList;

import aufgabe2_1.MatrixInterface;
import aufgabe2_1.Pair;

public class MatrixArrayList implements MatrixInterface{

	private ArrayList<Pair>[] matrix;
	private int arraySize;
	
	public MatrixArrayList(int size){
		arraySize = size;
		matrix = new ArrayList[size];
		
		for(int i = 0; i<size; i++){
			matrix[i] = new ArrayList<Pair>(); 
		}
	}
	
	
	@Override
	public MatrixInterface add(MatrixInterface elem) {
		for (int i = 0; i < this.size(); i++) {

			for (int j = 0; j < elem.size(); j++) {

				this.updateElement(i,j, this.getElement(i, j) + elem.getElement(i, j));

			}
		}


		return this;
	}

	@Override
	public MatrixInterface mul(int elem) {
		for (int i = 0; i < this.size(); i++) {

			for (int j = 0; j < this.size(); j++) {

				this.updateElement(i, j, this.getElement(i, j) * elem);

			}
		}
		return this;
	}

	@Override
	public MatrixInterface pow(int elem) {
		for (int i = 0; i < this.size(); i++) {

			for (int j = 0; j < this.size(); j++) {

				this.updateElement(i, j,
						(float) Math.pow(this.getElement(i, j), elem));

			}
		}

		return this;
	}

	@Override
	public MatrixInterface mul(MatrixInterface elem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		return matrix.length;
		
	}

	@Override
	public float getElement(int spalte, int zeile) {
		for(Pair elem : matrix[zeile]){
			if(elem.getColumn()==spalte)
				return elem.getElement();
		}
		return -1;
			
		
	}

	@Override
	public void setElement(int spalte, int zeile, float elem) {
		//if(matrix[ypos].size()<this.size() && matrix[ypos].get(xpos) != 0){
		
		matrix[zeile].add(new Pair(spalte, elem));
	}

	
	
	private void updateElement(int spalte, int zeile, float elem) {
		for(Pair pair : matrix[zeile]){
			if(pair.getColumn()==spalte)
				pair.setElement(elem);
		}
	}
	
	
	public String toString() {

		String result = " ";

		for (int i = 0; i < this.size(); i++) {
			for (Pair elem : matrix[i]){
				result = result + " " + elem.getElement();
			}
		}
		return result;
	}
	
	

}
