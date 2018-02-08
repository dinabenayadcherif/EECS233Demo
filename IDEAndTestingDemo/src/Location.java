
public class Location {
	
	private String name;
	private int saleAmount;
	private Location currentSalesLocation;
	
	public Location(String name, int saleAmount) {
		this.name = name;
		this.saleAmount = saleAmount;
	}
	

	public Location getCurrentSalesLocation() {
		return currentSalesLocation;
	}

	public void setCurrentSalesLocation(Location currentSalesLocation) {
		this.currentSalesLocation = currentSalesLocation;
	}

}
