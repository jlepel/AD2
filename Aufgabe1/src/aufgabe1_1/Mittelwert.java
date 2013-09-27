package aufgabe1_1;

import java.util.ArrayList;
import java.util.List;

public class Mittelwert {

	private List<Double> inputList = new ArrayList<Double>();
	private double sum = 0.0;
	private double varsum = 0.0;

	public boolean add(double elem) {
		sum = sum + elem;
		varsum = varsum + Math.pow(elem - average(), 2.0);
		return inputList.add(elem);
	}

	public double variance() {

		return varsum / (inputList.size() - 1);
	}

	public double average() {

		return sum / inputList.size();
	}
	
	public double getListSize(){
		return inputList.size();
	}

}
