package org.task;

public class Arts extends EducationMdOverRg{
	public void bSc(){
		System.out.println("The bsc dept score is 75" );
	}
	public void bEd() {
		System.out.println("The bEd dept score is 85");
	}
	public void ug(int id) {
		System.out.println("The Ug Percentage is" +77);	
	}
	
	public static void main(String[] args) {
		Arts mrk = new Arts();
		mrk.bSc();
		mrk.bEd();
		mrk.ug(77);
		mrk.pg();
	}
	

	
}
