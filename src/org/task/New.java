package org.task;

public class New extends AbstClass {

	@Override
	public void Partial() {
		System.out.println("King");
		
	}

	@Override
	public void Fully() {
		System.out.println("Queen");
		
	}
	public static void main(String[] args) {
		New c = new New();
		c.Partial();
		c.Fully();
		c.Komn();
	}
}
