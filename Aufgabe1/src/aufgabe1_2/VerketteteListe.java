package aufgabe1_2;

public class VerketteteListe implements VList {

	Element elem = new Element(null);

	@Override
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

	public void insert(Element element, int x) {
		int counter = 0;
		Element tmp;
		if (this.length() < x) {
			throw new IllegalArgumentException("Wert zu groß!");
		}
		
		if(x == 0){
			cons(element);
			
		}
		
		if(x > 0){
			while((elem.getNextElem() != null) || counter < x){
			counter ++;
		
		}
			
		}
		
		
	}

	@Override
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

	@Override
	public void head() {
		if (elem.getElementValue() == null) {
			throw new IllegalArgumentException("LEER");
		}

		this.elem = elem.getNextElem();

	}

	@Override
	public boolean isEmpty() {
		return (elem.getElementValue() == (null));
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