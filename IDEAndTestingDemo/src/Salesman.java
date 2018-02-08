
public class Salesman extends Employee {
	
	private Location currentSalesLocation;

	public Salesman(String name, int age, int salary) {
		super(name, age, salary);
		// TODO Auto-generated constructor stub
	}
	
	public void setLocation(Location location) {
		this.currentSalesLocation = location;
	}
	

	public Location getCurrentSalesLocation() {
		return currentSalesLocation;
	}

	public void setCurrentSalesLocation(Location currentSalesLocation) {
		this.currentSalesLocation = currentSalesLocation;
	}
	

}
