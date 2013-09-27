package aufgabe1_2;

public class VerketteteListe {

	Element elem = new Element(null);

	public void cons(Object element) {
		Element tmp = new Element(element);

		if (isEmpty()) {
			elem = tmp;
			this.elem.setNextElem(null);
		} else {
			tmp.setNextElem(elem);
			elem = tmp;

		}
	}
	
	public int length() {
		if (this.isEmpty()) {
			return 0;
		}

		int sum = 1;
		Element element = this.elem;
		while (element.getNextElem() != null) {
			element = element.getNextElem();
			sum++;
		}
		return sum;
	}

	public void head() {
		if (this.isEmpty()) {
			throw new IllegalArgumentException();
		}
		this.elem = elem.getNextElem(); 
		
	}

	public boolean isEmpty() {
		if (elem.getElementValue()==(null)) {
			return true;
		}
		return false;
	}
}

class Element {

	Object object;
	Element nextElem = null;

	public Element(Object elem) {
		this.object = elem;

	}

	public void setNextElem(Element elem) {
		this.nextElem = elem;
	}

	public Element getNextElem() {
		return this.nextElem;
	}

	public Object getElementValue() {
		return this.object;
	}

	public String toString() {
		return object.toString();
	}

}