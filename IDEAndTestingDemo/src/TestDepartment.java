import static org.junit.Assert.*;

import org.junit.Test;


public class TestDepartment {

	@Test
	public void testAverageSalary() {
		Department<Accountant> accounting = new Department<Accountant>("Accounting");
		Accountant angelaMartin = new Accountant("Angela Martin", 45, 60000);
		Accountant oscarMartinez = new Accountant("Oscar Martinez", 38, 55000);
		Accountant kevinMalone = new Accountant("Kevin Malone", 37, 45000);
		accounting.addEmployee(angelaMartin);
		accounting.addEmployee(oscarMartinez);
		accounting.addEmployee(kevinMalone);
		System.out.println(accounting.averageSalary());
		assertEquals(53333, accounting.averageSalary());
		//fail("Not yet implemented");
	}

}
