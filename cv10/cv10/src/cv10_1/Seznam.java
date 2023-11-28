package cv10_1;

import linrev.Element;

public class Seznam {
	private Prvek first;

	public void vloz(String s) { // add na začátek seznamu
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Prvek e = new Prvek(s);
		if (first == null) {
			first = e;
		} else {
			e.setNext(first);
			first = e;
		}

	}
	
	public void print() {
		Prvek tmp = first;
		while(tmp != null) {
			System.out.println(tmp.getData());
			tmp = tmp.getNext();
		}
	}
	
	

	public void odstranPredposledni() {
		int num = 0;
		Prvek tmp = first;
		while(tmp != null) {
			num ++;
			tmp = tmp.getNext();
		}
		//System.out.println(num);
		Prvek tmp1 = first;
		for(int i = 0; i < num-3; i++) {
			tmp1 = tmp1.getNext();
		}
		tmp1.setNext(tmp1.getNext().getNext());
		
	}

	public void vratProstredni() {
		// TODO Auto-generated method stub
		int num = 0;
		Prvek tmp = first;
		while(tmp != null) {
			num ++;
			tmp = tmp.getNext();
		}
		int num1 = num/2;
		Prvek tmp1 = first;
		for(int i = 0; i < num1; i++) {
			tmp1 = tmp1.getNext();
		}
		System.out.println(tmp1.getData());
	}
}
