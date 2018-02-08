import java.util.ArrayList;


public class Department<T extends Employee> {
	
	private ArrayList<T> employees;
	private String departmentName;
	
	public Department(String departmentName){
		this.departmentName = departmentName;
		this.employees = new ArrayList<T>();
		//this.employees = new ArrayList<T>();
	}
	
	public String getDepartmentName(){
		return this.departmentName;
	}
	
	public void setDepartmentName(String departmentName){
		this.departmentName = departmentName;
	}
	
	public void addEmployee(T e) {
		employees.add(e);
	}
	
	public ArrayList<T> getEmployees(){
		return this.employees;
	}
	
	public int averageSalary() {
		int averageSalary = 0;
		for(int i = 0; i< employees.size(); i++) {
			averageSalary = averageSalary + employees.get(i).getSalary();
		}
		return averageSalary/employees.size();
	}
	
	public ArrayList<T> findUnassignedEmployees(){
		ArrayList<T> unassignedEmployees = new ArrayList<T>();
		for (int i = 0; i <= this.employees.size(); i++) {
			if(((Salesman) this.employees.get(i)).getCurrentSalesLocation() == null)
				unassignedEmployees.add(this.employees.get(i));
		}
		return unassignedEmployees;
	}
	
	public ArrayList<T> findAssignedEmployees(){
		ArrayList<T> assignedEmployees = new ArrayList<T>();
		for (int i = 0; i <= this.employees.size(); i++) {
			if(((Salesman) this.employees.get(i)).getCurrentSalesLocation() != null)
				assignedEmployees.add(this.employees.get(i));
		}
		return assignedEmployees;
	}
	
	public static void main(String args[]) {
		Accountant angelaMartin = new Accountant("Angela Martin", 45, 10000);
		Accountant oscarMartinez = new Accountant("Oscar Martinez", 38, 10000);
		Receptionist pamBeesly = new Receptionist("Pam Beesly", 35, 100000);

		Department<Accountant> accounting = new Department<Accountant>("Accounting");
		accounting.addEmployee(angelaMartin);
		accounting.addEmployee(oscarMartinez);
		//accounting.addEmployee(pamBeesly);
		System.out.println(accounting.getEmployees());
		
		
		

    }

}
