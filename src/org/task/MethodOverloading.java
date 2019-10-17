package org.task;

public class MethodOverloading {
	public void companyName(String name) {
		System.out.println("The company name is"+name);
		
	}
	public void companyName(int id, String name) {
		System.out.println("The company id is"+id);
		System.out.println("The company name is"+name);
	}
	public void companyName(String empname, long Phnno, Double Salary) {
		System.out.println("The employee name is"+empname);
		System.out.println("The phone no is"+Phnno);
		System.out.println("The salary is"+Salary);
	}
  public static void main(String[] args) {
	  MethodOverloading cmp = new MethodOverloading();
	  cmp.companyName("CTS");
	  cmp.companyName(12345, "CTS");
	  cmp.companyName("Swetha", 9876543210l, 55555.55d);
	  
	
}
}
