package org.test;

public class EmployeeDetails {
		public void empDetails(int id, String name) {
			System.out.println("Id of the Employee"+id + "name of the Employee"+name);
			}
		public void empDetails(Double sal,long phonenum) {
			System.out.println("Salary of the Employee is"+sal + "Phone number of the Employee is"+phonenum );
			}
		private void empDetails(char gen, String location) {
			System.out.println("Gender if the Employee"+gen+ "Work location"+location);

		}
		public static void main(String[] args) {
			EmployeeDetails ed=new EmployeeDetails();
			ed.empDetails(1234,"Bhanu");
			ed.empDetails('M',"chennai");
			ed.empDetails(24.35,9087426646l);
			
		}
	
}


